package io.camunda.devrel.connectors.Model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.camunda.connector.generator.java.annotation.TemplateDiscriminatorProperty;

@TemplateDiscriminatorProperty(
    group = "query",
    name = "query.type",
    defaultValue = ""
)
public sealed class Query
    permits CharactersQuery,
        ComicsQuery,
        CreatorsQuery,
        EventsQuery,
        SeriesQuery,
        StoriesQuery {}
