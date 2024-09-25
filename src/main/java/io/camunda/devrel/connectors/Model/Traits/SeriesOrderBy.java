package io.camunda.devrel.connectors.Model.Traits;

public enum SeriesOrderBy {
    TITLE_ASC("title"),
    START_YEAR_ASC("startYear"),
    MODIFIED_ASC("modified"),
    TITLE_DESC("-title"),
    START_YEAR_DESC("-startYear"),
    MODIFIED_DESC("-modified");

    private String displayName;

    SeriesOrderBy(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() { return displayName; }

    // Optionally and/or additionally, toString.
    @Override public String toString() { return displayName; }
}
