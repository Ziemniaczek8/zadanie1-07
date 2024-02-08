package library_InneJeszcze;

import java.time.LocalDate;

public class NewsPaper extends LibraryItem{

    private LocalDate lastEdition;
    private String printingHouse;

    public NewsPaper(Status status, LocalDate lastEdition, String printingHouse) {
        super(status);
        this.lastEdition = lastEdition;
        this.printingHouse = printingHouse;
    }


}
