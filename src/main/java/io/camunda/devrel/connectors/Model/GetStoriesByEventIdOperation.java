package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "storiesGetByEventId", label = "List of Stories containing Character")
public final class GetStoriesByEventIdOperation extends EventsQuery {
    private EventId storiesGetByEventId_eventId;
    private StoriesFilters storiesGetByEventId_storiesFilters;
    private ModifiedSince storiesGetByEventId_modifiedSince;
    private CharactersList storiesGetByEventId_characters;
    private ComicsList storiesGetByEventId_comics;
    private CreatorsList storiesGetByEventId_creators;
    private EventsList storiesGetByEventId_events;
    private Pagination storiesGetByEventId_pagination;
}
