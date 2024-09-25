package io.camunda.devrel.connectors.Model.Traits;

import io.camunda.connector.generator.dsl.Property;
import io.camunda.connector.generator.java.annotation.TemplateProperty;

public record CreatorsList(
    @TemplateProperty(
        id = "creators",
        label = "Creators",
        description = "Return only records which feature work by the specified creators (accepts a comma-separated list of ids).",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.creators"))
    String creators
) {}
