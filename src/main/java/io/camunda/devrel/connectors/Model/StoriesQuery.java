package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateDiscriminatorProperty;
import io.camunda.connector.generator.java.annotation.TemplateSubType;

@TemplateSubType(id = "storiesQuery", label = "Stories Query")
@TemplateDiscriminatorProperty(group = "operation", name = "Story Operation")
public sealed class StoriesQuery extends Query
    permits GetAllStoriesQuery,
    GetStoriesByIdOperation,
    GetCharactersByStoryIdOperation,
    GetComicsByStoryIdOperation,
    GetCreatorsByStoryIdOperation,
    GetEventsByStoryIdOperation,
    GetSeriesByStoryIdOperation {}
