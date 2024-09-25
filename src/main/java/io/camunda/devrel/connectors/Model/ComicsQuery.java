package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateDiscriminatorProperty;
import io.camunda.connector.generator.java.annotation.TemplateSubType;

@TemplateSubType(id = "comicsQuery", label = "Comics Query")
@TemplateDiscriminatorProperty(group = "operation", name = "Comics Operation")
public sealed class ComicsQuery extends Query
    permits GetAllComicsOperation,
    GetComicsByIdOperation,
    GetCharactersByComicIdOperation,
    GetCreatorsByComicIdOperation,
    GetEventsByComicIdOperation,
    GetStoriesByComicIdOperation {}
