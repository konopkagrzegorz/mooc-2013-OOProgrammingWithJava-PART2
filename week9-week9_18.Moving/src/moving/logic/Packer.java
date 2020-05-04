/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author Grzegorz Konopka
 */
public class Packer {
    
    private int boxesVolume;
    
    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things) {
        List<Box> box = new ArrayList<Box>();
        int i = 0;
        for (Thing thing : things) {
            box.add(new Box(this.boxesVolume));
            box.get(i).addThing(thing);
            i++;
        }
        return box;
    } 
}
