package io.camunda.devrel.connectors.Model.Traits;

import io.camunda.connector.generator.dsl.Property;
import io.camunda.connector.generator.java.annotation.TemplateProperty;
import jakarta.validation.constraints.NotBlank;

public record ComicId(
    @TemplateProperty(
        id = "comicId",
        label = "Comic ID",
        description = "A single comic ID.",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.comicId"))
    @NotBlank
    Integer comicId
) {}
