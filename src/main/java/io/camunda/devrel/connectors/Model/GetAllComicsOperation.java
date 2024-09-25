package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "comicsGetAll", label = "Get all Comics")
public final class GetAllComicsOperation extends ComicsQuery {
    private ModifiedSince comicsGetAll_modifiedSince;
    private ComicsList comicsGetAll_comicsList;
    private EventsList comicsGetAll_eventsList;
    private SeriesList comicsGetAll_seriesList;
    private StoriesList comicsGetAll_storiesList;
    private Pagination comicsGetAll_pagination;
}
