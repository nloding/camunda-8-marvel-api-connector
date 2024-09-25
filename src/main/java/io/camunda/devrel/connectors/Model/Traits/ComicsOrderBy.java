package io.camunda.devrel.connectors.Model.Traits;

public enum ComicsOrderBy {
    FOC_DATE_ASC("focDate"),
    ONSALE_DATE_ASC("onsaleDate"),
    TITLE_ASC("title"),
    ISSUE_NUMBER_ASC("issueNumber"),
    MODIFIED_ASC("modified"),
    FOC_DATE_DESC("-focDate"),
    ONSALE_DATE_DESC("-onsaleDate"),
    TITLE_DESC("-title"),
    ISSUE_NUMBER_DESC("-issueNumber"),
    MODIFIED_DESC("-modified");

    private String displayName;

    ComicsOrderBy(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() { return displayName; }

    // Optionally and/or additionally, toString.
    @Override public String toString() { return displayName; }
}
