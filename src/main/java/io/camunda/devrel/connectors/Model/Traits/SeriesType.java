package io.camunda.devrel.connectors.Model.Traits;

public enum SeriesType {
    COLLECTION("collection"),
    ONE_SHOT("one shot"),
    LIMITED("limited"),
    ONGOING("ongoing");

    private String displayName;

    SeriesType(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() { return displayName; }

    // Optionally and/or additionally, toString.
    @Override public String toString() { return displayName; }
}
