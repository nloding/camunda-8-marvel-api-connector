package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "eventsGetByCreatorId", label = "List of events containing character")
public final class GetEventsByCreatorIdOperation extends CreatorsQuery {
    private CreatorId eventsGetByCreatorId_creatorId;
    private EventsFilters eventsGetByCreatorId_eventsFilters;
    private ModifiedSince eventsGetByCreatorId_modifiedSince;
    private ComicsList eventsGetByCreatorId_comics;
    private CreatorsList eventsGetByCreatorId_creators;
    private SeriesList eventsGetByCreatorId_series;
    private StoriesList eventsGetByCreatorId_stories;
    private Pagination eventsGetByCreatorId_pagination;
}
