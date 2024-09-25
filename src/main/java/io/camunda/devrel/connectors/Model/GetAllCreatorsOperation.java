package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "creatorsGetAll", label = "Get all Comics")
public final class GetAllCreatorsOperation extends CreatorsQuery {
    private ModifiedSince creatorsGetAll_modifiedSince;
    private ComicsList creatorsGetAll_comicsList;
    private EventsList creatorsGetAll_eventsList;
    private SeriesList creatorsGetAll_seriesList;
    private StoriesList creatorsGetAll_storiesList;
    private Pagination creatorsGetAll_pagination;
}
