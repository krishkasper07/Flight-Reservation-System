package frsproject.ims;

public class Main {
        public static void main(String[] args) {
             RegularTicket regularTicket=new RegularTicket("12345", "chennai",
                     "mumbai", "departure at  10:30", "arrive at 2:30",
                     "4A", 5000, true, null, null, "lunch");
             Ticket ticket=new Ticket();

             Address address=new Address("annahighroad","  chennai","  Tamilnadu");

             Passenger passenger=new Passenger();

             Flight flight=new Flight("12","deccan",100,50);

             Contact contact=new Contact();

            TouristTicket touristTicket=new TouristTicket("1236"," chennai"," america"," departure at 10:30","  arrival at 2:30",
                    "  64B  ",5000,false," newyork ",null);


            System.out.println("regular ticket Details: "+regularTicket.pnr+" "+regularTicket.from+" "+regularTicket.to+" "+regularTicket.departureDateTime+" "+regularTicket.arrivalDateTime+" "+

        regularTicket.seatNo+" "+regularTicket.price+" "+regularTicket.cancelled+" "+regularTicket.specialServices);

            System.out.println();

            System.out.println("Tourist Ticket details: "+touristTicket.pnr+" "+touristTicket.from+" "+touristTicket.departureDateTime+" "+touristTicket.arrivalDateTime+" "+
                    touristTicket.seatNo+" "+touristTicket.price+" "+touristTicket.cancelled+" "+touristTicket.selectedTouristLocation);

            System.out.println();

            System.out.println(ticket.cancelled);

            System.out.println();

System.out.println("Address: "+address.street+address.city+address.state);

            System.out.println();
System.out.println("Flight detail: "+flight.flightNumber+" "+flight.airline+" "+flight.bookedSeats+" "+flight.capacity);
            System.out.println();

System.out.println(contact.name+" "+contact.email+" "+contact.phone);

System.out.println();

System.out.println(passenger.address);



}

}
