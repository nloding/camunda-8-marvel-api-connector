package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "seriesGetByEventId", label = "List of Series containing Character")
public final class GetSeriesByEventIdOperation extends EventsQuery {
    private EventId seriesGetByEventId_eventId;
    private SeriesFilters seriesGetByEventId_seriesFilters;
    private ModifiedSince seriesGetByEventId_modifiedSince;
    private ComicsList seriesGetByEventId_comics;
    private CreatorsList seriesGetByEventId_creators;
    private EventsList seriesGetByEventId_events;
    private StoriesList seriesGetByEventId_stories;
    private Pagination seriesGetByEventId_pagination;
}
