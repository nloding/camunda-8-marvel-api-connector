package io.camunda.devrel.connectors.Model.Traits;

import io.camunda.connector.generator.dsl.Property;
import io.camunda.connector.generator.java.annotation.TemplateProperty;

public record CreatorsFilters(
    @TemplateProperty(
        id = "firstName",
        label = "First Name",
        description = "Filter by creator first name (e.g. Brian).",
        group = "operation",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.name"))
    String firstName,

    @TemplateProperty(
        id = "middleName",
        label = "Middle Name",
        description = "Filter by creator middle name (e.g. Michael).",
        group = "operation",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.middleName"))
    String middleName,

    @TemplateProperty(
        id = "lastName",
        label = "Last Name",
        description = "Filter by creator last name (e.g. Bendis).",
        group = "operation",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.lastName"))
    String lastName,

    @TemplateProperty(
        id = "suffix",
        label = "Suffix",
        description = "Filter by suffix or honorific (e.g. Jr., Sr.).",
        group = "operation",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.suffix"))
    String suffix,

    @TemplateProperty(
        id = "nameStartsWith",
        label = "Name Starts With",
        description = "Filter by creator names that match critera (e.g. B, St L).",
        group = "operation",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.nameStartsWith"))
    String nameStartsWith,

    @TemplateProperty(
        id = "firstNameStartsWith",
        label = "First Name Starts With",
        description = "Filter by creator first names that match critera (e.g. B, St L).",
        group = "operation",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.firstNameStartsWith"))
    String firstNameStartsWith,

    @TemplateProperty(
        id = "middleNameStartsWith",
        label = "Middle Name Starts With",
        description = "Filter by creator middle names that match critera (e.g. Mi).",
        group = "operation",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.middleNameStartsWith"))
    String middleNameStartsWith,

    @TemplateProperty(
        id = "lastNameStartsWith",
        label = "Last Name Starts With",
        description = "Filter by creator last names that match critera (e.g. Ben).",
        group = "operation",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.lastNameStartsWith"))
    String lastNameStartsWith,

    @TemplateProperty(
        id = "orderBy",
        label = "Order By",
        description = "Order the result set by a field or fields. Add a \"-\" to the value sort in descending order.",
        group = "orderBy",
        feel = Property.FeelMode.disabled,
        binding = @TemplateProperty.PropertyBinding(name = "operation.orderBy"))
    CreatorsOrderBy orderBy
) {
}
