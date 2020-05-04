
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
public class UserInterface {
    
    Scanner scanner;
    Tournament tournament;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.tournament = new Tournament();
    }
    
    public void startUI() {
        System.out.println("Kumpula ski jumping week\n"
                         + "\n" + "Write the names of the participants one at a time; "
                         + "an empty string brings you to the jumping phase.");
        String input;
        while (true) {
            System.out.print("  Participant name: ");
            input = scanner.nextLine();
            if (!input.isEmpty()) {
                Participant player = new Participant(input);
                tournament.addPlayer(player);
            } else {
                break;
            }
        }
        System.out.println("\nThe tournament begins!");
        while (true) {
            System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
            input = scanner.nextLine();
            System.out.println("");
            if (input.equals("jump")) {
                tournament.startRound();
            } else if (input.equals("quit")) {
                tournament.printTournamentResults();
                break;
            } else {
                System.out.println("Wrong input, re-enter: ");
            }
        }
       
    }
}
