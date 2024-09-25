package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.CharacterId;
import io.camunda.devrel.connectors.Model.Traits.EventId;

@TemplateSubType(id = "eventsGetById", label = "Get Character by ID")
public final class GetEventsByIdOperation extends EventsQuery {
    private EventId eventsGetById_eventId;
}
