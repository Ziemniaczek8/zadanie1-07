package library_czyjes;


public enum Status {

    /*
    Status (Enum)
Zadeklaruj jako publiczny.
Definiuje status przedmiotu (dostępny, wypożyczony, zarezerwowany). Dodaj pole z tłumaczeniem wartości na język polski.
     */
    AVAILABLE("dostępny"),
    BORROWED("wypożyczony"),
    RESERVED("zarezerwowany");

    private String translatedStatus;
    Status(String translatedStatus) {
        this.translatedStatus = translatedStatus;
    }

    public String getTranslatedStatus() {
        return translatedStatus;
    }
}