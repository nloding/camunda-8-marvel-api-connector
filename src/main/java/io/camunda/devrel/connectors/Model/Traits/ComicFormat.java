package io.camunda.devrel.connectors.Model.Traits;

public enum ComicFormat {
    COMIC("comic"),
    MAGAZINE("magazine"),
    TRADE_PAPERBACK("trade paperback"),
    HARDCOVER("hardcover"),
    DIGEST("digest"),
    GRAPHIC_NOVEL("graphic novel"),
    DIGITAL_COMIC("digital comic"),
    INFINITE_COMIC("infinite comic");

    private String displayName;

    ComicFormat(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() { return displayName; }

    // Optionally and/or additionally, toString.
    @Override public String toString() { return displayName; }
}
