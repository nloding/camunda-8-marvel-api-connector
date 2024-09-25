package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "seriesGetByCreatorId", label = "List of series containing character")
public final class GetSeriesByCreatorIdOperation extends CreatorsQuery {
    private CreatorId seriesGetByCreatorId_creatorId;
    private SeriesFilters seriesGetByCreatorId_seriesFilters;
    private ModifiedSince seriesGetByCreatorId_modifiedSince;
    private ComicsList seriesGetByCreatorId_comics;
    private CreatorsList seriesGetByCreatorId_creators;
    private EventsList seriesGetByCreatorId_events;
    private StoriesList seriesGetByCreatorId_stories;
    private Pagination seriesGetByCreatorId_pagination;
}
