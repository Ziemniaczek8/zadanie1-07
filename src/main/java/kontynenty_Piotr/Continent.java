package kontynenty_Piotr;

import java.util.Arrays;

public enum Continent {
/*
 *
 * Stwórz klasę enum Continent, która będzie zawierać informację o nazwie kontynentu oraz jego powierzchni (https://pl.wikipedia.org/wiki/Kontynent).
W ramach enuma zdeklaruj wszystkie kontynenty oraz metody statyczne do:
- zwracania największego kontynentu (skorzystaj z metody values())
- zwracania najmniejszego kontynentu (skorzystajc z metody values())
 */


    AFRICA("AFRICA",30.4),
    ANTARCTICA("ANTARCTICA", 13.2),
    ASIA ("ASIA", 44.6),
    AUSTRALIA("AUSTRALIA", 7.7),
    EUROPE("EUROPE",10.2),
    NORTH_AMERICA("NORTH_AMERICA", 24.2),
    SOUTH_AMERICA("SOUTH_AMERICA", 17.8),
    ;

    private double area;
    private String name;

    Continent(String name, double area){
        this.name = name;
        this.area = area;
    }

    static Continent showBiggest() {
        Continent[] continents = Continent.values();
        Arrays.sort(continents,  (c1, c2) -> (Continent.getArea(c2) >= Continent.getArea(c1))?1:-1);
        return continents[0];

    }

    static Continent showSmallest() {
        Continent[] continents = Continent.values();
        Arrays.sort(continents,  (c1, c2) -> (Continent.getArea(c2) <= Continent.getArea(c1))?1:-1);
        return continents[0];

    }

    static double getArea(Continent c) {
        return c.area;
    }
}
