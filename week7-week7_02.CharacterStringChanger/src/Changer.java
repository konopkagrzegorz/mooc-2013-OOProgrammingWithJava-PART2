
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class Changer {
    
    private List<Change> changes;
    
    public Changer() {
        this.changes = new ArrayList<Change>();
    }
    
    public void addChange(Change change) {
        this.changes.add(change);
    }
    
    public String change(String characterString) {
        for (Change change : this.changes) {
            characterString = change.change(characterString);
        }
        return characterString;
    }
    
}
