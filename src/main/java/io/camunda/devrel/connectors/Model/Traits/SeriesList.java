package io.camunda.devrel.connectors.Model.Traits;

import io.camunda.connector.generator.dsl.Property;
import io.camunda.connector.generator.java.annotation.TemplateProperty;

public record SeriesList(
    @TemplateProperty(
        id = "series",
        label = "Series",
        description = "Return only records which are part of the specified series (accepts a comma-separated list of ids).",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.series"))
    String series
) {}
