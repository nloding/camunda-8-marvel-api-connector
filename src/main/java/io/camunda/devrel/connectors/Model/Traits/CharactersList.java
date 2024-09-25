package io.camunda.devrel.connectors.Model.Traits;

import io.camunda.connector.generator.dsl.Property;
import io.camunda.connector.generator.java.annotation.TemplateProperty;

public record CharactersList(
    @TemplateProperty(
        id = "characters",
        label = "Characters",
        description = "Return only records which feature the specified characters (accepts a comma-separated list of ids).",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.characters"))
    String characters
) {}
