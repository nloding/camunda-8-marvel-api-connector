package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "comicsGetByCharacterId", label = "List of Comics containing Character")
public final class GetComicsByCharacterIdOperation extends CharactersQuery {
    private CharacterId comicsGetByCharacterId_characterId;
    private ComicsFilters comicsGetByCharacterId_comicsFilters;
    private ModifiedSince comicsGetByCharacterId_modifiedSince;
    private CreatorsList comicsGetByCharacterId_creators;
    private EventsList comicsGetByCharacterId_events;
    private SeriesList comicsGetByCharacterId_series;
    private StoriesList comicsGetByCharacterId_stories;
    private Pagination comicsGetByCharacterId_pagination;
}
