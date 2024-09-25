package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "charactersByEventId", label = "Get all Characters")
public final class GetCharactersByEventIdOperation extends EventsQuery {
    private EventId charactersByEventId_eventId;
    private CharactersFilters charactersByEventId_charactersFilters;
    private ModifiedSince charactersByEventId_modifiedSince;
    private ComicsList charactersByEventId_comicsList;
    private EventsList charactersByEventId_eventsList;
    private SeriesList charactersByEventId_seriesList;
    private StoriesList charactersByEventId_storiesList;
    private Pagination charactersByEventId_pagination;
}
