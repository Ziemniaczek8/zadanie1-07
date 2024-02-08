package library_czyjes;

import java.time.LocalDate;

public class NewsPaper extends LibraryItem {

    private LocalDate publicationDate;
    private String publishingHouse;

    private NewsPaper(LocalDate publicationDate, String publishingHouse) {
        super();
        this.publicationDate = publicationDate;
        this.publishingHouse = publishingHouse;
    }


    /*
    NewsPaper (Klasa)
Dziedziczy po LibraryItem
Pola klasy: data wydania (typ związany z datą), wydawnictwo.
Zaimplementuj prywatny konstruktor.
     */

}
