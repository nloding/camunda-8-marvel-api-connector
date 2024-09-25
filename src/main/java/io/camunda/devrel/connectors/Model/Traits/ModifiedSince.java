package io.camunda.devrel.connectors.Model.Traits;

import io.camunda.connector.generator.dsl.Property;
import io.camunda.connector.generator.java.annotation.TemplateProperty;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public record ModifiedSince(
    @TemplateProperty(
        id = "modifiedSince",
        label = "Modified Since",
        description = "Return only records which have been modified since the specified date (YYYY-MM-DD).",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.modifiedSince"))
    String modifiedSince
) {}
