package enum_Lekcja;


public enum Samochod {

    SPALINOWY(true, false), // obiekt w enumie, tworząc go wywołuje się konstruktor z 2 parametrami które podaję
    ELEKTRYCZNY; // w tym przypadku wywołuję konstruktor nieprzyjmujący parametrów

    private boolean czyMoznaTankowac = false; // pola obiektów enumu
    private boolean czyMoznaLadowac = true;


    Samochod(boolean tankowanie, boolean ladowanie) { // konstruktor z parametrami
        this.czyMoznaLadowac = ladowanie;
        this.czyMoznaTankowac = tankowanie;
    }

    Samochod() {
    } // konstruktor bezparametrowy

    public boolean czyMoznaTankowac() {
        return this.czyMoznaTankowac;
    } // metody getery

    public boolean czyMoznaLadowac() {
        return this.czyMoznaLadowac;
    }
}


