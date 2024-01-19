

public class Main {
    public static void main(String[] args) {
        Flight bishkek = new Flight();
        bishkek.setFlightNumber(123);
        bishkek.setPunktPoint("посадка");
        bishkek.setDepartureTime(19);
        bishkek.setArrivalTime("batken");
        Flight flight1 = new Flight();
flight1.setFlightNumber(23);
flight1.setPunktPoint("osh");
flight1.setDepartureTime(2);
flight1.setArrivalTime("2024.01.10");
Airport airport=new Airport();
bishkek.upDateStatus("on the way");
airport.addFlight(bishkek);
airport.addFlight(flight1);
airport.displayAllFlights();


    }
}