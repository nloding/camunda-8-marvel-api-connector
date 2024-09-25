package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateDiscriminatorProperty;
import io.camunda.connector.generator.java.annotation.TemplateSubType;

@TemplateSubType(id = "eventsQuery", label = "Events Query")
@TemplateDiscriminatorProperty(group = "operation", name = "Event Operation")
public sealed class EventsQuery extends Query
    permits GetAllEventsOperation,
    GetEventsByIdOperation,
    GetCharactersByEventIdOperation,
    GetComicsByEventIdOperation,
    GetCreatorsByEventIdOperation,
    GetSeriesByEventIdOperation,
    GetStoriesByEventIdOperation {}
