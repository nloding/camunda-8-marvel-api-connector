package io.camunda.devrel.connectors.Model.Traits;

import io.camunda.connector.generator.dsl.Property;
import io.camunda.connector.generator.java.annotation.TemplateProperty;
import jakarta.validation.constraints.NotBlank;

public record CharacterId(
    @TemplateProperty(
        id = "characterId",
        label = "Character ID",
        description = "A single character ID.",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.characterId"))
    @NotBlank
    Integer characterId
) {}
