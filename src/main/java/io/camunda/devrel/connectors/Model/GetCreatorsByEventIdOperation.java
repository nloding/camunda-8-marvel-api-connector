package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "creatorsGetByEventId", label = "Get all Characters")
public final class GetCreatorsByEventIdOperation extends EventsQuery {
    private EventId creatorsGetByEventId_eventId;
    private CreatorsFilters creatorsGetByEventId_creatorsFilters;
    private ModifiedSince creatorsGetByEventId_modifiedSince;
    private ComicsList creatorsGetByEventId_comicsList;
    private EventsList creatorsGetByEventId_eventsList;
    private SeriesList creatorsGetByEventId_seriesList;
    private StoriesList creatorsGetByEventId_storiesList;
    private Pagination creatorsGetByEventId_pagination;
}
