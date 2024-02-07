package library_Zadanie;

public class Main {

    /* Zaprojektuj aplikację w języku Java, która symuluje prosty system zarządzania biblioteką. System powinien pozwolić
    na dodawanie książek do katalogu, sprawdzanie dostępności i wypożyczanie książek. Użyj następujących elementów języka Java do realizacji zadania:

Klasa (class) - Klasa Book reprezentująca książkę w bibliotece. Powinna zawierać przynajmniej tytuł, autora i
rok wydania jako pola klasy.
Klasa (class) - Klasa NewsPaper reprezentująca gazetę. Powinna zawierać datę wydania i wydawnictwo.
Klasa abstrakcyjna (abstract class) - Klasa abstrakcyjna LibraryItem służąca jako bazowa klasa dla różnych typów
przedmiotów w bibliotece, np. książek, magazynów itp.
Interfejs (interface) - Interfejs Borrowable z metodami umożliwiającymi wypożyczenie i zwrot przedmiotu.
Powinien zawierać metody borrowItem() i returnItem().
Wyliczenie (enum) - Typ wyliczeniowy Status z wartościami AVAILABLE, BORROWED, RESERVED określającymi
status przedmiotu bibliotecznego.
Wszystkie klasy i interfejsy powinny być umieszczone w odpowiednich plikach.

Szczegóły implementacji:
LibraryItem (Klasa abstrakcyjna)
Zadeklaruj jako publiczną.
Powinna zawierać przynajmniej jedno pole status typu Status z modyfikatorem dostępu private.
Zdefiniuj konstruktor oraz gettery i settery dla pola status.

Book (Klasa)
Dziedziczy po LibraryItem i implementuje Borrowable.
Pola klasy: title, author, yearPublished powinny być prywatne.
Zaimplementuj konstruktor przyjmujący wszystkie wartości jako parametry oraz gettery dla tych pól.
Zaimplementuj metody z interfejsu Borrowable.
Stwórz metodę prywatną, która zwróci informację czy książka jest starsza niż 5 lat.
Jeśli podczas tworzenia instancji książka jest starsza niż 5 lat, pole author powinno być napisane z dużych liter.

NewsPaper (Klasa)
Dziedziczy po LibraryItem
Pola klasy: data wydania (typ związany z datą), wydawnictwo.
Zaimplementuj prywatny konstruktor.

Borrowable (Interfejs)
Zdefiniuj jako publiczny.
Metody borrowItem() i returnItem() niech zwracają boolean - true jeśli operacja się powiodła,
false w przeciwnym razie tzn. czy książka nie jest już wypożyczona.

Status (Enum)
Zadeklaruj jako publiczny.
Definiuje status przedmiotu (dostępny, wypożyczony, zarezerwowany). Dodaj pole z tłumaczeniem wartości na język polski.

Stwórz klasę main w której zaprezentujesz działanie biblioteki,
tzn. wypożyczanie książki, zwracanie informacji że jest już wypożyczona, zwroty, sposób zapisania tytułu. */

    public static void main(String[] args) {

        Book book1 = new Book(Status.AVAILABLE, "LOTR", "Tolkien", 1950);
        book1.isOlderThanFiveYears(book1);
        System.out.println(book1.getAuthor());

        String zmienna = book1.isOlderThanFiveYears(book1);
        System.out.println(zmienna);

    }
}
