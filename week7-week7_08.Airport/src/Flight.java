/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class Flight {
    
    private Plane plane;
    private String departureAirport;
    private String arrivalAirport;

    
    public Flight(Plane plane, String departureAirport, String arrivalAirport) {
        this.plane = plane;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return plane.toString() + " (" + getDepartureAirport() + "-" + getArrivalAirport() + ")";
    }
}
