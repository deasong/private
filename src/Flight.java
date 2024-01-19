public class Flight {
    private int flightNumber;
    private String punktPoint;
    private int departureTime;
    private String arrivalTime;

    public void upDateStatus(String punktPoint) {
        this.punktPoint = punktPoint;

    }

    public void flightDetails() {
        System.out.println("----------------------------------------------");
        System.out.println("flightnumber  " + flightNumber);
        System.out.println("status  " + punktPoint);
        System.out.println("time  " + departureTime);
        System.out.println("arrival " + arrivalTime);
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;

    }

    public String getPunktPoint() {
        return punktPoint;
    }

    public void setPunktPoint(String punktPoint) {
        this.punktPoint = punktPoint;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
