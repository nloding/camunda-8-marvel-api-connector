package io.camunda.devrel.connectors.Model.Traits;

import io.camunda.connector.generator.dsl.Property;
import io.camunda.connector.generator.java.annotation.TemplateProperty;
import jakarta.validation.constraints.NotBlank;

public record EventId(
    @TemplateProperty(
        id = "eventId",
        label = "Event ID",
        description = "A single event ID.",
        group = "operation",
        feel = Property.FeelMode.optional,
        binding = @TemplateProperty.PropertyBinding(name = "operation.eventId"))
    @NotBlank
    Integer eventId
) {}
