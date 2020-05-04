
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class Suitcase {
   private ArrayList<Thing> things;
   private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.things = new ArrayList<Thing>();
        this.maximumWeight = maximumWeight;
    }
    
    public void addThing(Thing thing) {
        if (thing.getWeight() + totalWeight() <= this.maximumWeight) {
        this.things.add(thing);
        }
    }

    @Override
    public String toString() {
        if (this.things.size() == 0) {
            return "empty (" + totalWeight() + " kg)";
        } else if (this.things.size() == 1) {
           return things.size() + " thing (" + totalWeight() + " kg)";
        } else {
        return things.size() + " things (" + totalWeight() + " kg)";
        }
    }

    public int totalWeight() {
         int totalWeight = 0;
        for (Thing thing : things) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }
    
    public void printThings() {
        for (Thing thing: this.things) {
            System.out.println(thing);
        }
    }
    
    public Thing heaviestThing() {
        if (things.size() == 0) {
            return null;
        }
        Thing heaviest = this.things.get(0);
        for (Thing thing: this.things) {
            if (thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }
        return heaviest;
    }
    
    
    


   
   
    
}
