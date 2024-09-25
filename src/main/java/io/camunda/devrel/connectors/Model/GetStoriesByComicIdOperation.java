package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "storiesGetByComicId", label = "List of Stories containing Character")
public final class GetStoriesByComicIdOperation extends ComicsQuery {
    private ComicId storiesGetByComicId_comicId;
    private StoriesFilters storiesGetByComicId_storiesFilters;
    private ModifiedSince storiesGetByComicId_modifiedSince;
    private CharactersList storiesGetByComicId_characters;
    private ComicsList storiesGetByComicId_comics;
    private CreatorsList storiesGetByComicId_creators;
    private EventsList storiesGetByComicId_events;
    private Pagination storiesGetByComicId_pagination;
}
