package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "eventsGetByCharacterId", label = "List of Events containing Character")
public final class GetEventsByCharacterIdOperation extends CharactersQuery {
    private CharacterId eventsGetByCharacterId_characterId;
    private EventsFilters eventsGetByCharacterId_eventsFilters;
    private ModifiedSince eventsGetByCharacterId_modifiedSince;
    private ComicsList eventsGetByCharacterId_comics;
    private CreatorsList eventsGetByCharacterId_creators;
    private SeriesList eventsGetByCharacterId_series;
    private StoriesList eventsGetByCharacterId_stories;
    private Pagination eventsGetByCharacterId_pagination;
}
