package io.camunda.devrel.connectors.Model.Traits;

import io.camunda.connector.generator.dsl.Property;
import io.camunda.connector.generator.java.annotation.TemplateProperty;

public record SeriesFilters(
    @TemplateProperty(
        id = "title",
        label = "Title",
        description = "Return only series matching the specified title.",
        group = "operation",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.title"))
    String title,

    @TemplateProperty(
        id = "titleStartsWith",
        label = "Title Starts With",
        description = "Return series with titles that begin with the specified string (e.g. Sp).",
        group = "operation",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.titleStartsWith"))
    String titleStartsWith,

    @TemplateProperty(
        id = "startYear",
        label = "Start Year",
        description = "Return only series matching the specified start year.",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.startYear"))
    Integer startYear,

    @TemplateProperty(
        id = "seriesType",
        label = "Series Type",
        description = "Filter the series by publication frequency type.",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.seriesType"))
    SeriesType seriesType,

    @TemplateProperty(
        id = "orderBy",
        label = "Order By",
        description = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order.",
        group = "orderBy",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.orderBy"))
    SeriesOrderBy orderBy
) {
}
