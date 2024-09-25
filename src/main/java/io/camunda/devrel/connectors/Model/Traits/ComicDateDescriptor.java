package io.camunda.devrel.connectors.Model.Traits;

public enum ComicDateDescriptor {
    LAST_WEEK("lastWeek"),
    THIS_WEEK("thisWeek"),
    NEXT_WEEK("nextWeek"),
    NEXT_MONTH("nextMonth");

    private String displayName;

    ComicDateDescriptor(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() { return displayName; }

    // Optionally and/or additionally, toString.
    @Override public String toString() { return displayName; }
}
