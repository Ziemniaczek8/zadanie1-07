package library_czyjes;

import java.time.LocalDate;

public class Book extends LibraryItem implements Borrowable {

    private String title;
    private String author;
    private int publicationDate;

    public Book(String title, String author, int publicationDate) {
        super();
        this.title = title;
        this.author = (olderThan5Years(publicationDate) ? author.toUpperCase() : author);
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    private boolean olderThan5Years(int yearBook){
        int actuallyYear = LocalDate.now().getYear();
        return actuallyYear - yearBook > 5;
    }


    @Override
    public boolean borrowItem() {
        Status status = super.getStatus();
        if(status == Status.AVAILABLE){
            super.setStatus(Status.BORROWED);
            return true;
        }
        return false;
    }

    @Override
    public boolean returnItem() {
        if(super.getStatus() == Status.BORROWED){
            super.setStatus(Status.AVAILABLE);
            return true;
        }
        return false;
    }



}
