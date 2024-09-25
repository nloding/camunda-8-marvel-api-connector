package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "seriesGetByCharacterId", label = "List of Series containing Character")
public final class GetSeriesByCharacterIdOperation extends CharactersQuery {
    private CharacterId seriesGetByCharacterId_characterId;
    private SeriesFilters seriesGetByCharacterId_seriesFilters;
    private ModifiedSince seriesGetByCharacterId_modifiedSince;
    private ComicsList seriesGetByCharacterId_comics;
    private CreatorsList seriesGetByCharacterId_creators;
    private EventsList seriesGetByCharacterId_events;
    private StoriesList seriesGetByCharacterId_stories;
    private Pagination seriesGetByCharacterId_pagination;
}
