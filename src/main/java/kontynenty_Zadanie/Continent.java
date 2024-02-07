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
        return field;
    }
}
