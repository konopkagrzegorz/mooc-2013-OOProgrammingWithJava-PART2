/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Random;

/**
 *
 * @author Grzegorz Konopka
 */
public class Vampire extends Character {
    
    private Random random;

    public Vampire(String name, int width, int height) {
        super(name, width, height);
        this.random = new Random();
        setX(random.nextInt(width));
        setY(random.nextInt(height));
    }

}
