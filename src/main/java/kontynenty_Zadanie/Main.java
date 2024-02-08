package kontynenty_Zadanie;

public class Main {

    /* Stwórz klasę enum Continent, która będzie zawierać informację o nazwie kontynentu oraz jego powierzchni
    (https://pl.wikipedia.org/wiki/Kontynent).
W ramach enuma zdeklaruj wszystkie kontynenty oraz metody statyczne do:
- zwracania największego kontynentu (skorzystaj z metody values())
- zwracania najmniejszego kontynentu (skorzystajc z metody values()) */


    public static void main(String[] args) {

        String smallestCon = kontynenty_Zadanie.Continent.calculateSmallestContinent();
        String biggestCon = Continent.calculateBiggestContinent();

        System.out.println(smallestCon);
        System.out.println(biggestCon);
    }
}
