
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class Airport {
    
    private ArrayList<Plane> planes;
    private ArrayList<Flight> flights;

    
    public Airport() {
        this.planes = new ArrayList<Plane>();
        this.flights = new ArrayList<Flight>();
    }

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }
    
    public void addPlane(Plane plane) {
        if (checkPlane(plane) == false) {
            planes.add(plane);
        }
        else {
            System.out.println("This plane already exists in airport!");
            }
        }   

    
    public void printPlanes() {
        for (int i = 0; i < planes.size(); i++) {
            System.out.println(planes.get(i).toString());
        }
    }
    
    public void printFlights() {
        for (int i = 0; i < flights.size(); i++) {
            System.out.println(flights.get(i).toString());
        }
    }
    
    private boolean checkPlane(Plane plane) {
        for (int i = 0; i < planes.size(); i++) {
        if (planes.get(i).getPlaneID().contains(plane.getPlaneID())) {
            return true;
        }
    }
        return false;
    }
    
    public void addFlight(Flight flight) {
        if (checkFlight(flight) == true) {
        flights.add(flight);
        } else {
            System.out.println("This flight already exists in airport database or plane does not exist!");
        }
    }
    
    private boolean checkFlight(Flight flight) {
        if (checkPlane(flight.getPlane()) == true) {
            Flight temp = new Flight(flight.getPlane(), "000", "000");
            for (int i = 0; i < flights.size(); i++) {
                if (flights.get(i).getPlane().getPlaneID().contains(flight.getPlane().getPlaneID())) {
                    temp = flights.get(i);
                }
            }
            if (temp.getDepartureAirport().contains(flight.getDepartureAirport())) {
                return false;
            } else if (temp.getArrivalAirport().contains(flight.getArrivalAirport())) {
                return false;
            }
        }
        return true;
    }
}