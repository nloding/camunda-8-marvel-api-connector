package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.CharacterId;
import io.camunda.devrel.connectors.Model.Traits.ComicId;

@TemplateSubType(id = "comicsGetById", label = "Get Character by ID")
public final class GetComicsByIdOperation extends ComicsQuery {
    private ComicId comicsGetById_comicId;
}
