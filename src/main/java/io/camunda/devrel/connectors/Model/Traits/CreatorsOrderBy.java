package io.camunda.devrel.connectors.Model.Traits;

public enum CreatorsOrderBy {
    FIRST_NAME_ASC("firstName"),
    MIDDLE_NAME_ASC("middleName"),
    LAST_NAME_ASC("lastName"),
    SUFFIX_ASC("suffix"),
    MODIFIED_ASC("modified"),
    FIRST_NAME_DESC("-firstName"),
    MIDDLE_NAME_DESC("-middleName"),
    LAST_NAME_DESC("-lastName"),
    SUFFIX_DESC("-suffix"),
    MODIFIED_DESC("-modified"),;

    private String displayName;

    CreatorsOrderBy(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() { return displayName; }

    // Optionally and/or additionally, toString.
    @Override public String toString() { return displayName; }
}
