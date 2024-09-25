package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "charactersByComicId", label = "Get all Characters")
public final class GetCharactersByComicIdOperation extends ComicsQuery {
    private ComicId charactersByComicId_comicId;
    private CharactersFilters charactersByComicId_charactersFilters;
    private ModifiedSince charactersByComicId_modifiedSince;
    private ComicsList charactersByComicId_comicsList;
    private EventsList charactersByComicId_eventsList;
    private SeriesList charactersByComicId_seriesList;
    private StoriesList charactersByComicId_storiesList;
    private Pagination charactersByComicId_pagination;
}
