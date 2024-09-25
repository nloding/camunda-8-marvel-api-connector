package io.camunda.devrel.connectors.Model;

import io.camunda.connector.generator.java.annotation.TemplateSubType;
import io.camunda.devrel.connectors.Model.Traits.CharacterId;
import io.camunda.devrel.connectors.Model.Traits.CreatorId;

@TemplateSubType(id = "creatorsGetById", label = "Get Character by ID")
public final class GetCreatorsByIdOperation extends CreatorsQuery {
    private CreatorId creatorsGetById_creatorId;
}
