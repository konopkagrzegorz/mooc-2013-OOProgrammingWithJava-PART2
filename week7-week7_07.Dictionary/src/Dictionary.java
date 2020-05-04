
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class Dictionary {
    
    private HashMap<String, String> finnishToEnglish;

    public Dictionary() {
        this.finnishToEnglish = new HashMap<String, String>();
    }
    
    public String translate(String word) {
        if (this.finnishToEnglish.containsKey(word)) {
            return finnishToEnglish.get(word);
        }
        return null;
    }
    
    public void add(String word, String translation) {
        finnishToEnglish.put(word, translation);
    }
    
    public int amountOfWords() {
        return finnishToEnglish.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<String>();
        for (String key : this.finnishToEnglish.keySet()) {
            String value = this.finnishToEnglish.get(key);

            String toAddToTranslationList = key + " = " + value;
            translationList.add(toAddToTranslationList);
        }
        return translationList;
    }
    
    
    
}
