package kontynenty_Oliwier;

public enum Continent {

    AFRYKA("Afryka",30.4), // nie podajemy parametru name...zamiast tego uzyjemy metody name()
    AMERYKA_POLUDNIOWA("Ameryka Południowa",17.8),
    AMERYKA_POLNOCNA("Ameryka Północna",24.2),
    ANTARKTYDA("Antarktyda",13.2),
    AUSTRALIA("Australia",7.7),
    EUROPA("EUROPA",10.2),
    AZHA("Azja",44.6);

    private String name;
    private double areaInKilometrs;
    Continent(String name, double areaInKilometrs){
        this.name = name;
        this.areaInKilometrs = areaInKilometrs;
    }

    public String getName() {
        return name;
    }

    public double getAreaInKilometrs() {
        return areaInKilometrs;
    }

    public static Continent getContinentWithSmallestArea(){
        Continent smalest = Continent.AFRYKA;
        for (Continent continent : Continent.values()){
            if(continent.getAreaInKilometrs() < smalest.getAreaInKilometrs()){
                smalest = continent;
            }
        }
        return smalest;
    }
    public static Continent getContinentWithHighestArea(){
        Continent highest = Continent.AFRYKA;
        for (Continent continent : Continent.values()){
            if(continent.getAreaInKilometrs() > highest.getAreaInKilometrs()){
                highest = continent;
            }
        }
        return highest;
    }
}
