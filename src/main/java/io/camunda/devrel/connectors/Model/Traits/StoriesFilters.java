package io.camunda.devrel.connectors.Model.Traits;

import io.camunda.connector.generator.dsl.Property;
import io.camunda.connector.generator.java.annotation.TemplateProperty;

public record StoriesFilters(
    @TemplateProperty(
        id = "orderBy",
        label = "Order By",
        description = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order.",
        group = "orderBy",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.orderBy"))
    StoriesOrderBy orderBy
) {
}
