package io.camunda.devrel.connectors.Model.Traits;

import io.camunda.connector.generator.dsl.Property;
import io.camunda.connector.generator.java.annotation.TemplateProperty;

public record ComicsList(
    @TemplateProperty(
        id = "comics",
        label = "Comics",
        description = "Return only records which take place in the specified comics (accepts a comma-separated list of ids).",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.comics"))
    String comics
) {}
