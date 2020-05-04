/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grzegorz Konopka
 */
public class MaxWeightBox extends Box {
    
    private int maxWeight;
    private List<Thing> things;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.things.contains(thing);
    }
    
    
    private int currentWeight() {
		int currWeight = 0;
		for (Thing thing : things) {
			currWeight += thing.getWeight();
		}
		return currWeight;
	}
    public void add(Thing thing) {
		int nextWeight = thing.getWeight() + currentWeight();
		if(nextWeight <= maxWeight) {
			things.add(thing);
		}
	}
    
}
