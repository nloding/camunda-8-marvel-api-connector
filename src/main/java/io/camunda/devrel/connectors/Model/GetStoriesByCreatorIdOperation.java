package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "storiesGetByCreatorId", label = "List of stories containing character")
public final class GetStoriesByCreatorIdOperation extends CreatorsQuery {
    private CreatorId storiesGetByCreatorId_creatorId;
    private StoriesFilters storiesGetByCreatorId_storiesFilters;
    private ModifiedSince storiesGetByCreatorId_modifiedSince;
    private CharactersList storiesGetByCreatorId_characters;
    private ComicsList storiesGetByCreatorId_comics;
    private CreatorsList storiesGetByCreatorId_creators;
    private EventsList storiesGetByCreatorId_events;
    private Pagination storiesGetByCreatorId_pagination;
}
