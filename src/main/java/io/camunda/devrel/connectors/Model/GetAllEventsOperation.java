package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.*;

@TemplateSubType(id = "eventsGetAll", label = "Get all characters")
public final class GetAllEventsOperation extends EventsQuery {
    private EventsFilters eventsGetAll_eventsFilters;
    private ModifiedSince eventsGetAll_modifiedSince;
    private ComicsList eventsGetAll_comicsList;
    private SeriesList eventsGetAll_seriesList;
    private StoriesList eventsGetAll_storiesList;
    private Pagination eventsGetAll_pagination;
}
