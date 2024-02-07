package library_Zadanie;

public interface Borrowable {

    boolean borrowItem(Book book);

    boolean returnItem(Book book);
}
