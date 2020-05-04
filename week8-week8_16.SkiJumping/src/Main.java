
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        /*Participant one = new Participant("Martyna");
        Participant two = new Participant("Grzegorz");
        
        one.jump();
        two.jump();
        one.jump();
        two.jump();
        one.jump();
        two.jump();
        
        System.out.println(one.toString());
        System.out.println(two.toString());
        
        Tournament newTournament = new Tournament();
        newTournament.addPlayer(new Participant("Martyna"));
        newTournament.addPlayer(new Participant("Grzegorz"));
        newTournament.startRound();
        newTournament.startRound();
        newTournament.printTournamentResults();*/
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);
        ui.startUI();
    }
}
