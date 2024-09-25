package io.camunda.devrel.connectors.Model.Traits;

import io.camunda.connector.generator.dsl.Property;
import io.camunda.connector.generator.java.annotation.TemplateProperty;

public record ComicsFilters (
    @TemplateProperty(
        id = "format",
        label = "Format",
        description = "Filter by the issue format.",
        group = "operation",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.format"))
    ComicFormat format,

    @TemplateProperty(
        id = "formatType",
        label = "Format Type",
        description = "Filter by the issue format type.",
        group = "operation",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.formatType"))
    ComicFormatType formatType,

    @TemplateProperty(
        id = "noVariants",
        label = "Exclude Variants?",
        description = "Exclude variant comics from the result set.",
        group = "operation",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.noVariants"))
    Boolean noVariants,

    @TemplateProperty(
        id = "dateDescriptor",
        label = "Predefined Date Range",
        description = "Return comics within a predefined date range.",
        group = "operation",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.dateDescriptor"))
    ComicDateDescriptor dateDescriptor,

    @TemplateProperty(
        id = "dateRange",
        label = "Date Range",
        description = "Return comics within a predefined date range. Dates must be specified as date1,date2 (e.g. 2013-01-01,2013-01-02).",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.dateRange"))
    String dateRange,

    @TemplateProperty(
        id = "title",
        label = "Title",
        description = "Return only issues in series whose title matches the input.",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.title"))
    String title,

    @TemplateProperty(
        id = "titleStartsWith",
        label = "Title Starts With",
        description = "Return only issues in series whose title starts with the input.",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.titleStartsWith"))
    String titleStartsWith,

    @TemplateProperty(
        id = "startYear",
        label = "Start Year",
        description = "Return only issues in series whose start year matches the input.",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.startYear"))
    Integer startYear,

    @TemplateProperty(
        id = "issueNumber",
        label = "Issue Number",
        description = "Return only issues in series whose issue number matches the input.",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.issueNumber"))
    Integer issueNumber,

    @TemplateProperty(
        id = "diamondCode",
        label = "Diamond Code",
        description = "Filter by diamond code.",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.diamondCode"))
    String diamondCode,

    @TemplateProperty(
        id = "digitalId",
        label = "Digital ID",
        description = "Filter by digital comic id.",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.digitalId"))
    Integer digitalId,

    @TemplateProperty(
        id = "upc",
        label = "UPC",
        description = "Filter by UPC.",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.upc"))
    String upc,

    @TemplateProperty(
        id = "isbn",
        label = "ISBN",
        description = "Filter by ISBN.",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.isbn"))
    String isbn,

    @TemplateProperty(
        id = "ean",
        label = "EAN",
        description = "Filter by EAN.",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.ean"))
    String ean,

    @TemplateProperty(
        id = "issn",
        label = "ISSN",
        description = "Filter by ISSN.",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.issn"))
    String issn,

    @TemplateProperty(
        id = "hasDigitalIssue",
        label = "Has Digital Issue?",
        description = "Include only results which are available digitally.",
        group = "operation",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.hasDigitalIssue"))
    Boolean hasDigitalIssue,

    @TemplateProperty(
        id = "orderBy",
        label = "Order By",
        description = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order.",
        group = "orderBy",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.orderBy"))
    ComicsOrderBy orderBy
){}

