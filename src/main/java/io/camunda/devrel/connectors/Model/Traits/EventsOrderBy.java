package io.camunda.devrel.connectors.Model.Traits;

public enum EventsOrderBy {
    NAME_ASC("name"),
    START_DATE_ASC("startDate"),
    MODIFIED_ASC("modified"),
    START_DATE_DESC("-startDate"),
    NAME_DESC("-name"),
    MODIFIED_DESC("-modified");

    private String displayName;

    EventsOrderBy(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() { return displayName; }

    // Optionally and/or additionally, toString.
    @Override public String toString() { return displayName; }
}
