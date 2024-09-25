package io.camunda.devrel.connectors.Model.Traits;

import io.camunda.connector.generator.dsl.Property;
import io.camunda.connector.generator.java.annotation.TemplateProperty;
import jakarta.validation.constraints.NotBlank;

public record SeriesId(
    @TemplateProperty(
        id = "seriesId",
        label = "Series ID",
        description = "A single series ID.",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.seriesId"))
    @NotBlank
    Integer seriesId
) {}
