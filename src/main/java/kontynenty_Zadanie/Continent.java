package kontynenty_Zadanie;

public enum Continent {

    AFRYKA(30.4),
    AMERYKA_S(17.8),
    AMERYKA_N(24.2),
    EUROPA(10.2),
    AZJA(44.6),
    AUSTRALIA(7.7),
    ANTARKTYDA(13.2);

    private double field;

    Continent(double field) {
        this.field = field;
    }

    public double getField() {
        return this.field;
    }

    public static String calculateSmallestContinent() {
        Continent smallest = AFRYKA;
        Continent[] values = Continent.values();
        for (int i = 0; i < values.length; i++) {
            Continent continent = values[i];

            if (continent.field < smallest.field) {
                smallest = continent;
            }
        }
        return smallest.name();
    }

    public static String calculateBiggestContinent() {
        Continent biggest = AFRYKA;
        for (Continent continent : Continent.values()) {
            if (continent.field > biggest.field) {
                biggest = continent;
            }
        }
        return "The biggest continent is: " + biggest.name() + " with field of: " + biggest.getField() + "mln km";
    }
}
