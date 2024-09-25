package io.camunda.devrel.connectors.Model.Traits;

import io.camunda.connector.generator.dsl.Property;
import io.camunda.connector.generator.java.annotation.TemplateProperty;
import jakarta.validation.constraints.NotBlank;

public record StoryId(
    @TemplateProperty(
        id = "storyId",
        label = "Story ID",
        description = "A single story ID.",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.storyId"))
    @NotBlank
    Integer storyId
) {}
