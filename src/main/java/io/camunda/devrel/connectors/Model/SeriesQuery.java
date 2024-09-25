package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateDiscriminatorProperty;
import io.camunda.connector.generator.java.annotation.TemplateSubType;

@TemplateSubType(id = "seriesQuery", label = "Series Query")
@TemplateDiscriminatorProperty(group = "operation", name = "Series Operation")
public sealed class SeriesQuery extends Query
    permits GetAllSeriesOperation,
    GetSeriesByIdOperation,
    GetCharactersBySeriesIdOperation,
    GetComicsBySeriesIdOperation,
    GetCreatorsBySeriesIdOperation,
    GetEventsBySeriesIdOperation,
    GetStoriesBySeriesIdOperation {}
