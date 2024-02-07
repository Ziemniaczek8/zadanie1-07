package library_Zadanie;

public abstract class LibraryItem {

    private Status status;

    public LibraryItem() {

    }

    public LibraryItem(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
