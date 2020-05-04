
import java.util.ArrayList;
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
public class Participant implements Comparable<Participant>{
    
    private String name;
    private int totalPoints;
    private List<Jump> jumps;

    public Participant(String name) {
        this.name = name;
        this.totalPoints = 0;
        this.jumps = new ArrayList<Jump>();
    }

    public String getName() {
        return name;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public List<Jump> getJumps() {
        return jumps;
    }
    
    private int calculateResult() {
        totalPoints = 0;
        for (Jump jump : jumps) {
            this.totalPoints += jump.getPointsForJump();
        }
        return totalPoints;
    }
    
    public void jump() {
        Jump jump = new Jump();
        jumps.add(jump);
        calculateResult();
    }
    
    public String printLength() {
        String str = "";
        for (int i = 0; i < jumps.size(); i++) {
            str += jumps.get(i).getLength() + " m,";
        }
        str = str.substring(0, str.length() - 1);
        return str;
    }

    @Override
    public String toString() {
        return "           " + getName() + " (" + getTotalPoints() + " points)\n"
             + "            jump lengths: " + printLength();
    }
    
    public String onlyNameAndPoints() {
        return getName() + " (" + getTotalPoints() + " points)";
    }
    
    public void printSingleJumpResult() {
        System.out.println("  " + getName() + "\n"
                         + "    length: " + jumps.get(jumps.size() - 1).getLength() + "\n"
                         + "    judge votes: " + jumps.get(jumps.size() - 1).getJudgeVotes());
    }
    
    @Override
    public int compareTo(Participant o) {
        return getTotalPoints() - o.getTotalPoints();
    }
}
