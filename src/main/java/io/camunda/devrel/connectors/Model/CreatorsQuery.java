package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateDiscriminatorProperty;
import io.camunda.connector.generator.java.annotation.TemplateSubType;

@TemplateSubType(id = "creatorsQuery", label = "Creators Query")
@TemplateDiscriminatorProperty(group = "operation", name = "Creator Operation")
public sealed class CreatorsQuery extends Query
    permits GetAllCreatorsOperation,
    GetCreatorsByIdOperation,
    GetComicsByCreatorIdOperation,
    GetEventsByCreatorIdOperation,
    GetSeriesByCreatorIdOperation,
    GetStoriesByCreatorIdOperation {}
