/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author Grzegorz Konopka
 */
public class Organism implements Movable {

    private int dx;
    private int dy;

    public Organism(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    @Override
    public String toString() {
        return "x: " + dx + "; y: " + dy;
    }
    
    @Override
    public void move(int dx, int dy) {
        this.dx += dx;
        this.dy += dy;
    }
    
    
    
}
