
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class RingingCentre {
    
    private Map<Bird, List<String>> observedBirds;

    public RingingCentre() {
        this.observedBirds = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place) {
        if (!this.observedBirds.containsKey(bird)) {
            this.observedBirds.put(bird, new ArrayList<String>());
        }
        this.observedBirds.get(bird).add(place);
    }
    
    public void observations(Bird bird) {
        if (this.observedBirds.get(bird) == null) {
            System.out.println(bird + " observations: 0");
        } else {
            int obsNum = this.observedBirds.get(bird).size();
            System.out.println(bird + " observations: " + obsNum);
            for (int i = 0; i < obsNum; i++) {
                System.out.println(observedBirds.get(bird).get(i));
            }
        }
    }
}
