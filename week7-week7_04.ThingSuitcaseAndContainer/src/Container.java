
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
public class Container {
    
    private ArrayList<Suitcase> suitcases;
    private int maximumContainerWeight;

    public Container(int maximumContainerWeight) {
        this.suitcases = new ArrayList<Suitcase>();
        this.maximumContainerWeight = maximumContainerWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + totalWeight() <= this.maximumContainerWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase: this.suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }
}
