
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class AirportUserInterface {
    
    private Scanner scanner;
    private Airport airport;
    

    public AirportUserInterface() {
        this.scanner = new Scanner(System.in);
        this.airport = new Airport();
    }
    
    public void printAirportPanelHeading() {
        System.out.println("Airport panel\n" +
                           "--------------------");
        System.out.println();
                          
    }
    
    public void printAirportPanelMenu() {
        System.out.println("Choose operation:\n" +
                           "[1] Add airplane\n" +
                           "[2] Add flight\n" +
                           "[x] Exit");
        System.out.print("> ");
    }
    
    public void printAirportServiceHeading() {
        System.out.println("Flight service\n" +
                           "------------");
        System.out.println();
    }
    
    public void printAirportServiceMenu() {
        System.out.println("Choose operation:\n" +
                           "[1] Print planes\n" +
                           "[2] Print flights\n" +
                           "[3] Print plane info\n" +
                           "[x] Quit");
        System.out.print("> ");
    }
    
    public void start() {
        printAirportPanelHeading();
        while (true) {
            printAirportPanelMenu();
            String input = scanner.nextLine();
            if (input.trim().toLowerCase().equals("1")) {
                addPlaneUI();     
            } else if (input.trim().toLowerCase().equals("2")) {
                addFlightUI();
            } else if (input.trim().toLowerCase().equals("x")) {
                startFlightMenu();
                break;
            } else {
                System.out.println("This action does not exist!");
            }
        }
    }
    
    public void startFlightMenu() {
        printAirportServiceHeading();
        printAirportServiceMenu();
        while (true) {
            String input = scanner.nextLine();
            if (input.trim().toLowerCase().equals("1")) {
                printPlanesUI();     
            } else if (input.trim().toLowerCase().equals("2")) {
                printFlightsUI();
            } else if (input.trim().toLowerCase().equals("3")) {
                printPlaneInfoUI();
            } else if (input.trim().toLowerCase().equals("x")){
                break;
            } else {
                System.out.println("This action does not exist!");
            }
        }
    }
    
    public void addPlaneUI() {
        System.out.print("Give plane ID: ");
        String planeID = scanner.nextLine().trim().toUpperCase();
        System.out.print("Give plane capacity: ");
        String planeCapasity = scanner.nextLine().trim().toUpperCase();
        airport.addPlane(new Plane(planeID,Integer.parseInt(planeCapasity)));
    }
    
    public void addFlightUI() {
        System.out.print("Give plane ID: ");
        String planeID = scanner.nextLine().trim().toUpperCase();
        System.out.print("Give departure airport code: ");
        String departureAirport = scanner.nextLine().trim().toUpperCase();
        System.out.print("Give destination airport code: ");
        String arrivalAirport = scanner.nextLine().trim().toUpperCase();
        Plane plane = new Plane("000",0);
        for (int i = 0; i < airport.getPlanes().size(); i++) {
            if (airport.getPlanes().get(i).getPlaneID().contains(planeID)) {
                plane = airport.getPlanes().get(i);
                airport.addFlight(new Flight(plane, departureAirport, arrivalAirport));
            }
        }
    }
    
    public void printPlanesUI() {
        airport.printPlanes();
    }
    
    public void printFlightsUI() {
        airport.printFlights();
    }
    
    public void printPlaneInfoUI() {
        System.out.print("Give plane ID: ");
        String input = scanner.nextLine().trim().toUpperCase();
        for (int i = 0; i < airport.getPlanes().size(); i++) {
            if (airport.getPlanes().get(i).getPlaneID().contains(input)) {
                System.out.println(airport.getPlanes().get(i).toString());
            } else {
                System.out.println("This plane does not exist in this airport!");
            }
        }
    }
    
}
