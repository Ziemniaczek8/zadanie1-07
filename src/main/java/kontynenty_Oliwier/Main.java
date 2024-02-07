package kontynenty_Oliwier;

public class Main {

    /* Stwórz klasę enum Continent, która będzie zawierać informację o nazwie kontynentu oraz jego powierzchni
    (https://pl.wikipedia.org/wiki/Kontynent).
W ramach enuma zdeklaruj wszystkie kontynenty oraz metody statyczne do:
- zwracania największego kontynentu (skorzystaj z metody values())
- zwracania najmniejszego kontynentu (skorzystajc z metody values()) */


    public static void main(String[] args) {
        Continent highest = Continent.getContinentWithHighestArea();
        Continent smallest = Continent.getContinentWithSmallestArea();
        System.out.println("Najmniejsza powierzchnia: " + smallest.getName() + " wynosi " + smallest.getAreaInKilometrs() + "mln km");
        System.out.println("Najwieksza powierzchnia: " + highest.getName() + " wynosi " + highest.getAreaInKilometrs() + "mln km");
    }


}
