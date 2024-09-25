package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.dsl.Property;
import io.camunda.connector.generator.java.annotation.TemplateProperty;
import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.CharacterId;
import io.camunda.devrel.connectors.Model.Traits.Pagination;
import jakarta.validation.constraints.NotBlank;

@TemplateSubType(id = "charactersGetById", label = "Get Character by ID")
public final class GetCharactersByIdOperation extends CharactersQuery {
    private CharacterId charactersGetById_characterId;
}
