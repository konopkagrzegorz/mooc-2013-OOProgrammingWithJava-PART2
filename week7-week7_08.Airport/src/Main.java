
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        /*Plane plane = new Plane("HOL-LOL", 42);
        Plane plane2 = new Plane("HOL-LOL", 42);
        Plane plane3 = new Plane ("LOL-BOL", 43);
        Flight flight1 = new Flight(plane, "BAL", "SOL");
        Flight flight2 = new Flight(plane2, "BAL", "SOL");
        Flight flight3 = new Flight(plane3, "BAL", "SOL");
        Flight flight4 = new Flight(plane, "WAL", "MAL");
        Airport air = new Airport();
        air.addPlane(plane);
        air.addPlane(plane2);      
        air.addPlane(plane3);
        air.printAirport();
        air.addFlight(flight1);
        air.addFlight(flight2);
        air.addFlight(flight3);
        air.addFlight(flight4);
        air.printFlights();
        Scanner scanner = new Scanner(System.in);*/
        AirportUserInterface ui = new AirportUserInterface();
        ui.start();
    }
}
