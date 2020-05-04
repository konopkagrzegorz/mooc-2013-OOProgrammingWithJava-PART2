
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class Jump {
    
    private final int JUDGES_QUANTITY = 5;
    private final int length;
    private final List<Integer> judgeVotes;
    private final int pointsForJump;

    public Jump() {
        this.length = ThreadLocalRandom.current().nextInt(60, 120 + 1);
        this.judgeVotes = new ArrayList<Integer>();
        for (int i = 0; i < JUDGES_QUANTITY; i++) {
            judgeVotes.add(ThreadLocalRandom.current().nextInt(10, 20 + 1));
        }
        this.pointsForJump = addPointForJump();
    }

    public int getLength() {
        return length;
    }

    public int getPointsForJump() {
        return pointsForJump;
    }

    public List<Integer> getJudgeVotes() {
        return judgeVotes;
    }

    private List<Integer> sortVotes() {
       ArrayList<Integer> sortedJudgeVotes = new ArrayList<Integer>();
       sortedJudgeVotes.addAll(judgeVotes);
       Collections.sort(sortedJudgeVotes);
       return sortedJudgeVotes;
    }

    private int addPointForJump() {
        int pointsForJump = 0;
        for (int i = 1; i < sortVotes().size() - 1; i++) {
            pointsForJump += sortVotes().get(i);
        }
        pointsForJump = pointsForJump + getLength();
        return pointsForJump;
    }
}
