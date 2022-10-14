package libaray;

import util.DateRange;

import java.time.LocalDate;

public class LogEntry implements DateRange {
    public String name = "bob";
    public LocalDate checkIn;
    public LocalDate checkOut;

    public

    public String getName(){

        return name;
    }

    public LocalDate getStart(){
        return checkIn;
    }

    public LocalDate getEnd(){
        return checkOut;
    }


}
