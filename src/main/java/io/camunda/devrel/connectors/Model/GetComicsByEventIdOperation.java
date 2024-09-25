package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "comicsGetByEventId", label = "List of Comics containing Character")
public final class GetComicsByEventIdOperation extends EventsQuery {
    private EventId comicsGetByEventId_eventId;
    private ComicsFilters comicsGetByEventId_comicsFilters;
    private ModifiedSince comicsGetByEventId_modifiedSince;
    private CreatorsList comicsGetByEventId_creators;
    private EventsList comicsGetByEventId_events;
    private SeriesList comicsGetByEventId_series;
    private StoriesList comicsGetByEventId_stories;
    private Pagination comicsGetByEventId_pagination;
}
