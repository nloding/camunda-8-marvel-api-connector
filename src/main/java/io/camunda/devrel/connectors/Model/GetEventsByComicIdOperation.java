package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "eventsGetByComicId", label = "List of events containing comic")
public final class GetEventsByComicIdOperation extends ComicsQuery {
    private ComicId eventsGetByComicId_comicId;
    private EventsFilters eventsGetByComicId_eventsFilters;
    private ModifiedSince eventsGetByComicId_modifiedSince;
    private ComicsList eventsGetByComicId_comics;
    private CreatorsList eventsGetByComicId_creators;
    private SeriesList eventsGetByComicId_series;
    private StoriesList eventsGetByComicId_stories;
    private Pagination eventsGetByComicId_pagination;
}
