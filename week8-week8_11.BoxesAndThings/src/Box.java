
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
public class Box implements ToBeStored {
    
    private final double maximumWeight;
    private ArrayList<ToBeStored> things;

    public Box(double maximumWeight) {
        this.things = new ArrayList<ToBeStored>();
        this.maximumWeight = maximumWeight;
    }

    @Override
    public double weight() {
        double weight = 0.0;
        for (ToBeStored object : this.things) {
            weight += object.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + weight() + " kg";
    }
    
    public void add (ToBeStored toAdd) {

        double boxWeight = toAdd.weight();

        if (boxWeight + this.weight() <= this.maximumWeight) {
            this.things.add(toAdd);
        }
    }
}
