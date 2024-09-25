package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "comicsGetByCreatorId", label = "List of Comics containing Character")
public final class GetComicsByCreatorIdOperation extends CreatorsQuery {
    private CreatorId comicsGetByCreatorId_creatorId;
    private ComicsFilters comicsGetByCreatorId_comicsFilters;
    private ModifiedSince comicsGetByCreatorId_modifiedSince;
    private CreatorsList comicsGetByCreatorId_creators;
    private EventsList comicsGetByCreatorId_events;
    private SeriesList comicsGetByCreatorId_series;
    private StoriesList comicsGetByCreatorId_stories;
    private Pagination comicsGetByCreatorId_pagination;
}
