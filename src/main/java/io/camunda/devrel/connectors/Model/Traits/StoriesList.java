package io.camunda.devrel.connectors.Model.Traits;

import io.camunda.connector.generator.dsl.Property;
import io.camunda.connector.generator.java.annotation.TemplateProperty;

public record StoriesList(
    @TemplateProperty(
        id = "stories",
        label = "Stories",
        description = "Return only records which contain the specified stories (accepts a comma-separated list of ids).",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.stories"))
    String stories
) {}
