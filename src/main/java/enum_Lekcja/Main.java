package enum_Lekcja;

public class Main {

    public static void main(String[] args) {
        Samochod auto = Samochod.ELEKTRYCZNY; // zapisuję obiekt enumu do zmiennej

        wypiszDoCzego(Samochod.ELEKTRYCZNY); // ten sam obiekt enumu od razu przekazuję do wywołania metody
        wypiszDoCzego(Samochod.SPALINOWY);
        wypiszDoCzego(auto); // mogę też poprzez zmienną wcześniej utworzoną

        String elektrycznyNazwa = auto.name(); // "ELEKTRYCZNY", nazwa obiektu enum zapisana do String
        Samochod[] samochods = Samochod.values(); // statyczna metoda w enum zwracająca tablicę z obiektami enumu
        Samochod ele = Samochod.valueOf("ELEKTRYCZNY"); // mapowanie ze String na istniejący obiekt Enumu
        // zwroci enum o tej konkretnej nazwie...nazwa musi się dokladnie pokrywac z nazwą instancji enum
    }

    public static void wypiszDoCzego(Samochod auto) { // przyjmuję jeden z obiektów z enum Samochod jako parametr
        if (auto.czyMoznaTankowac()) System.out.println("przyjmuje paliwo");
        else System.out.println("na baterie");
    }
}
