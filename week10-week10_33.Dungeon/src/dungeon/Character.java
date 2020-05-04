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
public abstract class Character {
   
    private String name; // name 
    private int x; // position in x direction
    private int y; // position in y direction
    private int width; // size of the gamegrid
    private int height; // size of the gamegrid

    public Character(String name, int width, int height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }
    // get name
    public String getName() {
        return name; 
    }
    
    // get x position
    public int getX() {
        return x;
    }
    
    // get y position
    public int getY() {
        return y;
    }
    
    // get widith of gamegrid
    public int getWidth() {
        return width;
    }
    
    // get height of gamegrid
    public int getHeight() {
        return height;
    }
    
    // set x position
    public void setX(int x) {
        this.x = x;
    }
    
    // set y position
    public void setY(int y) {
        this.y = y;
    }
    
    // abstract method to move a character
    public void move(ArrayList<String> move) {
        
    }
    public void move(int moves, boolean vampireMoves) {
        
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 67 * hash + this.x;
        hash = 67 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Character other = (Character) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return name + " " + x + " " + y;
    }
}
