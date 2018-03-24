/*
 * Copyright (c) 1997, 2017, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package jdk.javadoc.internal.doclets.formats.html;


import jdk.javadoc.internal.doclets.formats.html.markup.Table;
import jdk.javadoc.internal.doclets.formats.html.markup.TableHeader;

import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;

import jdk.javadoc.internal.doclets.formats.html.markup.HtmlConstants;
import jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle;
import jdk.javadoc.internal.doclets.formats.html.markup.HtmlTag;
import jdk.javadoc.internal.doclets.formats.html.markup.HtmlTree;
import jdk.javadoc.internal.doclets.formats.html.markup.Links;
import jdk.javadoc.internal.doclets.formats.html.markup.StringContent;
import jdk.javadoc.internal.doclets.toolkit.Content;
import jdk.javadoc.internal.doclets.toolkit.MemberSummaryWriter;
import jdk.javadoc.internal.doclets.toolkit.PropertyWriter;


/**
 * Writes property documentation in HTML format.
 *
 *  <p><b>This is NOT part of any supported API.
 *  If you write code that depends on this, you do so at your own risk.
 *  This code and its internal interfaces are subject to change or
 *  deletion without notice.</b>
 *
 * @author Robert Field
 * @author Atul M Dambalkar
 * @author Jamie Ho (rewrite)
 * @author Bhavesh Patel (Modified)
 */
public class PropertyWriterImpl extends AbstractMemberWriter
    implements PropertyWriter, MemberSummaryWriter {

    public PropertyWriterImpl(SubWriterHolderWriter writer, TypeElement typeElement) {
        super(writer, typeElement);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Content getMemberSummaryHeader(TypeElement typeElement, Content memberSummaryTree) {
        memberSummaryTree.addContent(HtmlConstants.START_OF_PROPERTY_SUMMARY);
        Content memberTree = writer.getMemberTreeHeader();
        writer.addSummaryHeader(this, typeElement, memberTree);
        return memberTree;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addMemberTree(Content memberSummaryTree, Content memberTree) {
        writer.addMemberTree(memberSummaryTree, memberTree);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Content getPropertyDetailsTreeHeader(TypeElement typeElement,
            Content memberDetailsTree) {
        memberDetailsTree.addContent(HtmlConstants.START_OF_PROPERTY_DETAILS);
        Content propertyDetailsTree = writer.getMemberTreeHeader();
        propertyDetailsTree.addContent(links.createAnchor(SectionName.PROPERTY_DETAIL));
        Content heading = HtmlTree.HEADING(HtmlConstants.DETAILS_HEADING,
                contents.propertyDetailsLabel);
        propertyDetailsTree.addContent(heading);
        return propertyDetailsTree;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Content getPropertyDocTreeHeader(ExecutableElement property,
            Content propertyDetailsTree) {
        propertyDetailsTree.addContent(links.createAnchor(name(property)));
        Content propertyDocTree = writer.getMemberTreeHeader();
        Content heading = new HtmlTree(HtmlConstants.MEMBER_HEADING);
        heading.addContent(utils.getPropertyLabel(name(property)));
        propertyDocTree.addContent(heading);
        return propertyDocTree;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Content getSignature(ExecutableElement property) {
        Content pre = new HtmlTree(HtmlTag.PRE);
        writer.addAnnotationInfo(property, pre);
        addModifiers(property, pre);
        Content propertylink = writer.getLink(new LinkInfoImpl(
                configuration, LinkInfoImpl.Kind.MEMBER,
                utils.getReturnType(property)));
        pre.addContent(propertylink);
        pre.addContent(" ");
        if (configuration.linksource) {
            Content propertyName = new StringContent(name(property));
            writer.addSrcLink(property, propertyName, pre);
        } else {
            addName(name(property), pre);
        }
        return pre;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addDeprecated(ExecutableElement property, Content propertyDocTree) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addComments(ExecutableElement property, Content propertyDocTree) {
        TypeElement holder = (TypeElement)property.getEnclosingElement();
        if (!utils.getFullBody(property).isEmpty()) {
            if (holder.equals(typeElement) ||
                    (!utils.isPublic(holder) || utils.isLinkable(holder))) {
                writer.addInlineComment(property, propertyDocTree);
            } else {
                Content link =
                        writer.getDocLink(LinkInfoImpl.Kind.PROPERTY_COPY,
                        holder, property,
                        utils.isIncluded(holder)
                                ? holder.getSimpleName() : holder.getQualifiedName(),
                            false);
                Content codeLink = HtmlTree.CODE(link);
                Content descfrmLabel = HtmlTree.SPAN(HtmlStyle.descfrmTypeLabel,
                        utils.isClass(holder)
                                ? contents.descfrmClassLabel
                                : contents.descfrmInterfaceLabel);
                descfrmLabel.addContent(Contents.SPACE);
                descfrmLabel.addContent(codeLink);
                propertyDocTree.addContent(HtmlTree.DIV(HtmlStyle.block, descfrmLabel));
                writer.addInlineComment(property, propertyDocTree);
            }
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addTags(ExecutableElement property, Content propertyDocTree) {
        writer.addTagsInfo(property, propertyDocTree);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Content getPropertyDetails(Content propertyDetailsTree) {
        if (configuration.allowTag(HtmlTag.SECTION)) {
            HtmlTree htmlTree = HtmlTree.SECTION(getMemberTree(propertyDetailsTree));
            return htmlTree;
        }
        return getMemberTree(propertyDetailsTree);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Content getPropertyDoc(Content propertyDocTree,
            boolean isLastContent) {
        return getMemberTree(propertyDocTree, isLastContent);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addSummaryLabel(Content memberTree) {
        Content label = HtmlTree.HEADING(HtmlConstants.SUMMARY_HEADING,
                contents.propertySummary);
        memberTree.addContent(label);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableHeader getSummaryTableHeader(Element member) {
        return new TableHeader(contents.typeLabel, contents.propertyLabel,
                contents.descriptionLabel);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Table createSummaryTable() {
        String summary = resources.getText("doclet.Member_Table_Summary",
            resources.getText("doclet.Property_Summary"),
            resources.getText("doclet.properties"));

        return new Table(configuration.htmlVersion, HtmlStyle.memberSummary)
                .setSummary(summary)
                .setCaption(contents.properties)
                .setHeader(getSummaryTableHeader(typeElement))
                .setColumnStyles(HtmlStyle.colFirst, HtmlStyle.colSecond, HtmlStyle.colLast)
                .setRowScopeColumn(1)
                .setUseTBody(false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addSummaryAnchor(TypeElement typeElement, Content memberTree) {
        memberTree.addContent(links.createAnchor(SectionName.PROPERTY_SUMMARY));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addInheritedSummaryAnchor(TypeElement typeElement, Content inheritedTree) {
        inheritedTree.addContent(links.createAnchor(
                SectionName.PROPERTIES_INHERITANCE,
                configuration.getClassName(typeElement)));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addInheritedSummaryLabel(TypeElement typeElement, Content inheritedTree) {
        Content classLink = writer.getPreQualifiedClassLink(
                LinkInfoImpl.Kind.MEMBER, typeElement, false);
        Content label;
        if (configuration.summarizeOverriddenMethods) {
            label = new StringContent(utils.isClass(typeElement)
                    ? resources.getText("doclet.Properties_Declared_In_Class")
                    : resources.getText("doclet.Properties_Declared_In_Interface"));
        } else {
            label = new StringContent(utils.isClass(typeElement)
                    ? resources.getText("doclet.Properties_Inherited_From_Class")
                    : resources.getText("doclet.Properties_Inherited_From_Interface"));
        }
        Content labelHeading = HtmlTree.HEADING(HtmlConstants.INHERITED_SUMMARY_HEADING,
                label);
        labelHeading.addContent(Contents.SPACE);
        labelHeading.addContent(classLink);
        inheritedTree.addContent(labelHeading);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void addSummaryLink(LinkInfoImpl.Kind context, TypeElement typeElement, Element member,
            Content tdSummary) {
        Content memberLink = HtmlTree.SPAN(HtmlStyle.memberNameLink,
                writer.getDocLink(context, typeElement,
                member,
                utils.getPropertyLabel(name(member)),
                false,
                true));

        Content code = HtmlTree.CODE(memberLink);
        tdSummary.addContent(code);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void addInheritedSummaryLink(TypeElement typeElement, Element member, Content linksTree) {
        String mname = name(member);
        Content content = writer.getDocLink(LinkInfoImpl.Kind.MEMBER, typeElement, member,
                utils.isProperty(mname) ? utils.getPropertyName(mname) : mname,
                false, true);
        linksTree.addContent(content);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void addSummaryType(Element member, Content tdSummaryType) {
        addModifierAndType(member, utils.getReturnType((ExecutableElement)member), tdSummaryType);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Content getDeprecatedLink(Element member) {
        return writer.getDocLink(LinkInfoImpl.Kind.MEMBER, member,
                utils.getFullyQualifiedName(member));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Content getNavSummaryLink(TypeElement typeElement, boolean link) {
        if (link) {
            if (typeElement == null) {
                return Links.createLink(
                        SectionName.PROPERTY_SUMMARY,
                        contents.navProperty);
            } else {
                return links.createLink(
                        SectionName.PROPERTIES_INHERITANCE,
                        configuration.getClassName(typeElement), contents.navProperty);
            }
        } else {
            return contents.navProperty;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void addNavDetailLink(boolean link, Content liNav) {
        if (link) {
            liNav.addContent(Links.createLink(
                    SectionName.PROPERTY_DETAIL,
                    contents.navProperty));
        } else {
            liNav.addContent(contents.navProperty);
        }
    }
}
