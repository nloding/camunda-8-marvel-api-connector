package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateDiscriminatorProperty;
import io.camunda.connector.generator.java.annotation.TemplateSubType;

@TemplateSubType(id = "charactersQuery", label = "Characters Query")
@TemplateDiscriminatorProperty(group = "operation", name = "Character Operation")
public sealed class CharactersQuery extends Query
    permits GetAllCharactersOperation,
    GetCharactersByIdOperation,
    GetComicsByCharacterIdOperation,
    GetEventsByCharacterIdOperation,
    GetSeriesByCharacterIdOperation,
    GetStoriesByCharacterIdOperation {}