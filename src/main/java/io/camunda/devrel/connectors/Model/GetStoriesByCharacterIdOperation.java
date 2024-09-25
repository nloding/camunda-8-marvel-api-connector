package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "storiesGetByCharacterId", label = "List of Stories containing Character")
public final class GetStoriesByCharacterIdOperation extends CharactersQuery {
    private CharacterId storiesGetByCharacterId_characterId;
    private StoriesFilters storiesGetByCharacterId_storiesFilters;
    private ModifiedSince storiesGetByCharacterId_modifiedSince;
    private CharactersList storiesGetByCharacterId_characters;
    private ComicsList storiesGetByCharacterId_comics;
    private CreatorsList storiesGetByCharacterId_creators;
    private EventsList storiesGetByCharacterId_events;
    private Pagination storiesGetByCharacterId_pagination;
}
