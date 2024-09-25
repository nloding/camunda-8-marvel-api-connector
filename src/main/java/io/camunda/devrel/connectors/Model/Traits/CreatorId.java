package io.camunda.devrel.connectors.Model.Traits;

import io.camunda.connector.generator.dsl.Property;
import io.camunda.connector.generator.java.annotation.TemplateProperty;
import jakarta.validation.constraints.NotBlank;

public record CreatorId(
    @TemplateProperty(
        id = "creatorId",
        label = "Creator ID",
        description = "A single creator ID.",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.creatorId"))
    @NotBlank
    Integer creatorId
) {}
