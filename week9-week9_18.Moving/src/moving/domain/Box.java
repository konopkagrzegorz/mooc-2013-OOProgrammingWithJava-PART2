/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grzegorz Konopka
 */
public class Box implements Thing {
    
    private int maximumCapasity;
    private List<Thing> things;

    public Box(int maximumCapasity) {
        this.maximumCapasity = maximumCapasity;
        this.things = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing) {
        if (getVolume() + thing.getVolume() <= this.maximumCapasity) {
            this.things.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int sum = 0;
        for (Thing thing : this.things)
            sum += thing.getVolume();
        return sum;
    }
    
    
    
    
    
}
