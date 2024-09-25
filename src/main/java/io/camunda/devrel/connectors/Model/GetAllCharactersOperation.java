package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "charactersGetAll", label = "Get all characters")
public final class GetAllCharactersOperation extends CharactersQuery {
    private CharactersFilters charactersGetAll_charactersFilters;
    private ModifiedSince charactersGetAll_modifiedSince;
    private ComicsList charactersGetAll_comicsList;
    private EventsList charactersGetAll_eventsList;
    private SeriesList charactersGetAll_seriesList;
    private StoriesList charactersGetAll_storiesList;
    private Pagination charactersGetAll_pagination;
}
