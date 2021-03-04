package frsproject.ims;
import java.time.LocalDateTime;
public class RegularTicket {
    String pnr;
    String from;
    String to;
    String departureDateTime;
    String arrivalDateTime;
    String seatNo;
    float price;
    boolean cancelled;
    String specialServices;

    RegularTicket(String pnr, String from, String to, String departureDateTime,
                          private String pnr;
                          private String from;
                          private String to;
                          private String departureDateTime;
                          private String arrivalDateTime;
                          private String seatNo;
                          private float price;
                          private boolean cancelled;
                          private String specialServices;
                          private Flight flight;
                          private Passenger passenger;

    public RegularTicket(String pnr, String from, String to, String departureDateTime,String arrivalDateTime, String seatNo, float price,
            boolean cancelled, String specialServices) {
            boolean cancelled, String specialServices, Flight flight, Passenger passenger) {
            this.pnr = pnr;
            this.from = from;
            this.to = to;
            this.departureDateTime = departureDateTime;
            this.arrivalDateTime = arrivalDateTime;
            this.seatNo = seatNo;
            this.price = price;
            this.cancelled = cancelled;
            this.specialServices = specialServices;
            this.flight = flight;
            this.passenger = passenger;
        }

        public String getPnr() {
            return pnr;
        }

        public void setPnr(String pnr) {
            this.pnr = pnr;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public String getDepartureDateTime() {
            return departureDateTime;
        }

        public void setDepartureDateTime(String departureDateTime) {
            this.departureDateTime = departureDateTime;
        }

        public String getArrivalDateTime() {
            return arrivalDateTime;
        }

        public void setArrivalDateTime(String arrivalDateTime) {
            this.arrivalDateTime = arrivalDateTime;
        }

        public String getSeatNo() {
            return seatNo;
        }

        public void setSeatNo(String seatNo) {
            this.seatNo = seatNo;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public boolean isCancelled() {
            return cancelled;
        }

        public void setCancelled(boolean cancelled) {
            this.cancelled = cancelled;
        }

        public void setSpecialServices(String specialServices) {
            this.specialServices = specialServices;
        }

        String checkStatus() {
            public Flight getFlight() {
                return flight;
            }

            public void setFlight(Flight flight) {
                this.flight = flight;
            }

            public Passenger getPassenger() {
                return passenger;
            }

            public void setPassenger(Passenger passenger) {
                this.passenger = passenger;
            }

            public String checkStatus() {
                return cancelled ? "Cancelled" : "Confirmed";
            }

            int getFlightDuration() {

   public int getFlightDuration() {

   LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureDateTime);
   LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalDateTime);
return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) * 24 +
  (arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
                }

   void cancel() {
  public void cancel() {
  cancelled = true;
    }

     String getSpecialServices() {
     public String getSpecialServices() {
     return specialServices;
     }
 void updateSpecialServices(String specialServices) {
 public void updateSpecialServices(String specialServices) {
 this.specialServices = specialServices;
 }
 }
 }
   }
            }
    }
    }
}