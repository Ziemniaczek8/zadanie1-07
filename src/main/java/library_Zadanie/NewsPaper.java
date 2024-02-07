package library_Zadanie;

import java.time.LocalDate;

public class NewsPaper extends LibraryItem {

    private LocalDate dateOfPublish;
    private String publisher;

    public NewsPaper(LocalDate dateOfPublish, String publisher) {
        this.dateOfPublish = dateOfPublish;
        this.publisher = publisher;
    }

    public NewsPaper(Status status, LocalDate dateOfPublish, String publisher) {
        super(status);
        this.dateOfPublish = dateOfPublish;
        this.publisher = publisher;
    }
}
