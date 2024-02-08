package library_czyjes;

public abstract class LibraryItem {

    /*
    Szczegóły implementacji:
LibraryItem (Klasa abstrakcyjna)
Zadeklaruj jako publiczną.
Powinna zawierać przynajmniej jedno pole status typu Status z modyfikatorem dostępu private.
Zdefiniuj konstruktor oraz gettery i settery dla pola status.

     */
    private Status status = Status.AVAILABLE;

    public LibraryItem() {}

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
