/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;

/**
 *
 * @author Grzegorz Konopka
 */
public class Player extends Character {
    
    private int moves; // number of moves in game

    public Player(String name, int width, int height, int moves) {
        super(name, width, height);
        this.moves = moves;
    }

    @Override
    public void move(ArrayList<String> move) {
        boolean decreaseMove = false;
            if (this.moves > 0) {
            for (String string : move) {
                if (string.equals("w")) {
                    if (getX() > 0) {
                        setX(getX() -1);
                        decreaseMove = true;
                    }
                } else if (string.equals("s")) {
                    if (getX() < getHeight()) {
                        setX(getX() + 1);
                        decreaseMove = true;
                    }
                } else if (string.equals("a")) {
                    if (getY() > 0 ) {
                        setY(getY() - 1);
                        decreaseMove = true;
                    }
                } else if (string.equals("d")) {
                    if (getY() < getWidth()) {
                        setY(getY() + 1);
                        decreaseMove = true;
                    }
                } else {
                    System.out.println("Did not recogonize character: " + string + ", skipped");
                }
            }
        }
        if (decreaseMove == true) {
            this.moves--;
        }
    }
}