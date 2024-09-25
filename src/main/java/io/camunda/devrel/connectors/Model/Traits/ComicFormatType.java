package io.camunda.devrel.connectors.Model.Traits;

public enum ComicFormatType {
    COMIC("comic"),
    COLLECTION("collection");

    private String displayName;

    ComicFormatType(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() { return displayName; }

    // Optionally and/or additionally, toString.
    @Override public String toString() { return displayName; }
}
