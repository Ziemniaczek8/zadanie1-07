package library_Zadanie;

import java.time.LocalDate;

public class Book extends LibraryItem implements Borrowable {

    private String title;
    private String author;
    private int yearPublished;

    private int currentYear = LocalDate.now().getYear();

    public Book() {
        super();
    }


    public Book(Status status, String title, String author, int yearPublished) {
        super(status);
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    @Override
    public boolean borrowItem(Book book) {
        if (book.getStatus().equals(Status.AVAILABLE)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean returnItem(Book book) {
        return book.getStatus().equals(Status.BORROWED);
    }

    public String isOlderThanFiveYears(Book book) {
        if (book.getYearPublished() <= currentYear) {
            return book.getAuthor().toUpperCase();
        } else {
            return "";
        }
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getCurrentYear() {
        return currentYear;
    }
}
