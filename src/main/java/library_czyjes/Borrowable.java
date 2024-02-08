package library_czyjes;

public interface Borrowable {

    /*
    Borrowable (Interfejs)
Zdefiniuj jako publiczny.
Metody borrowItem() i returnItem() niech zwracają boolean - true jeśli operacja się powiodła, false w przeciwnym razie tzn. czy książka nie jest już wypożyczona.
     */

    boolean borrowItem();

    boolean returnItem();

}
