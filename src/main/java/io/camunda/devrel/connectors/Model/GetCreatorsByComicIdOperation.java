package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "creatorsByComicId", label = "Get all Characters")
public final class GetCreatorsByComicIdOperation extends ComicsQuery {
    private ComicId creatorsByComicId_comicId;
    private CreatorsFilters creatorsByComicId_creatorsFilters;
    private ModifiedSince creatorsByComicId_modifiedSince;
    private ComicsList creatorsByComicId_comicsList;
    private EventsList creatorsByComicId_eventsList;
    private SeriesList creatorsByComicId_seriesList;
    private StoriesList creatorsByComicId_storiesList;
    private Pagination creatorsByComicId_pagination;
}
