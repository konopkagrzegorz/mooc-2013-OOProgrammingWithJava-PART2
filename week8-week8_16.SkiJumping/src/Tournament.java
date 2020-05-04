
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class Tournament {
    
    private List<Participant> players;
    private int rounds;

    public Tournament() {
        this.players = new ArrayList<Participant>();
        this.rounds = 0;
    }

    public int getRounds() {
        return rounds;
    }

    public List<Participant> getPlayers() {
        return players;
    }

    public void addPlayer(Participant player) {
        this.players.add(player);
    }
    
    public void startRound() {
        Collections.sort(this.players);
        this.rounds++;
        System.out.println("Round " + getRounds() + "\n" + "\nJumping order:");
        for (int i = 0; i < this.players.size(); i++) {
            System.out.println("  " + (i+1) + ". " + players.get(i).onlyNameAndPoints());
        }
        for (Participant player : players) {
            player.jump();
        }
        System.out.println("");
        System.out.println("Results of round " + getRounds());
        for (Participant player : this.players) {
            player.printSingleJumpResult();
        }
    }
    
    public void printTournamentResults() {
        Collections.sort(players);
        Collections.reverse(players);
        System.out.println("Thanks!\n"
                         + "\n" 
                         + "Tournament results:\n"
                         + "Position    Name");
        for (int i = 0; i < this.players.size(); i++) {
            System.out.println((i+1) + players.get(i).toString());
        }
        System.out.println("          ");
    }
}
