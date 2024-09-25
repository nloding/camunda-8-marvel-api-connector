package io.camunda.devrel.connectors.Model.Traits;

import io.camunda.connector.generator.dsl.Property;
import io.camunda.connector.generator.java.annotation.TemplateProperty;

public record Pagination(
    @TemplateProperty(
        id = "paginationLimit",
        label = "Limit",
        description = "Limit the result set to the specified number of resources.",
        group = "pagination",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "pagination.limit"),
        defaultValue = "10")
    Integer limit,

    @TemplateProperty(
        id = "paginationOffset",
        label = "Offset",
        description = "Skip the specified number of resources in the result set.",
        group = "pagination",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "pagination.offset"),
        defaultValue = "0")
    Integer offset
) {}
