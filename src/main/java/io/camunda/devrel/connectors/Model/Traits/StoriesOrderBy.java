package io.camunda.devrel.connectors.Model.Traits;

public enum StoriesOrderBy {
    ID_ASC("id"),
    MODIFIED_ASC("modified"),
    ID_DESC("-id"),
    MODIFIED_DESC("-modified");

    private String displayName;

    StoriesOrderBy(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() { return displayName; }

    // Optionally and/or additionally, toString.
    @Override public String toString() { return displayName; }
}
