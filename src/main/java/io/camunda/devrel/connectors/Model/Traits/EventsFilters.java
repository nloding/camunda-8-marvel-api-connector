package io.camunda.devrel.connectors.Model.Traits;

import io.camunda.connector.generator.dsl.Property;
import io.camunda.connector.generator.java.annotation.TemplateProperty;

public record EventsFilters(
    @TemplateProperty(
        id = "name",
        label = "Name",
        description = "Return only events which match the specified name.",
        group = "operation",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.name"))
    String name,

    @TemplateProperty(
        id = "nameStartsWith",
        label = "Name Starts With",
        description = "Return events with names that begin with the specified string (e.g. Sp).",
        group = "operation",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.nameStartsWith"))
    String nameStartsWith,

    @TemplateProperty(
        id = "orderBy",
        label = "Order By",
        description = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order.",
        group = "orderBy",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.orderBy"))
    EventsOrderBy orderBy
) {
}
