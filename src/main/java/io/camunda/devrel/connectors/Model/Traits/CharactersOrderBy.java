package io.camunda.devrel.connectors.Model.Traits;

public enum CharactersOrderBy {
    NAME_ASC("name"),
    MODIFIED_ASC("modified"),
    NAME_DESC("-name"),
    MODIFIED_DESC("-modified");

    private String displayName;

    CharactersOrderBy(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() { return displayName; }

    // Optionally and/or additionally, toString.
    @Override public String toString() { return displayName; }
}
