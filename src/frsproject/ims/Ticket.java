package frsproject.ims;

import java.time.LocalDateTime;

public class Ticket {
     String pnr;
     String from;
     String to;
     String departureDateTime;
     String arrivalDateTime;
     String seatNo;
     float price;
     boolean cancelled;
     Flight flight;
     Passenger passenger;

    public String checkStatus() {
        return cancelled ? "Cancelled" : "Confirmed";
    }
    public int getFlightDuration() {
        LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureDateTime);
        LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalDateTime);
        return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) * 24 +
                (arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
    }
    public void cancel() {
        cancelled = true;
    }

}
