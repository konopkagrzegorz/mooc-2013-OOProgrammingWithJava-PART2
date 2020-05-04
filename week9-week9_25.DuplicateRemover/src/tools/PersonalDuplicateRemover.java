/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Grzegorz Konopka
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

    private List<String> words;
    private int duplicatedCount;

    public PersonalDuplicateRemover() {
        this.words = new ArrayList<String>();
        this.duplicatedCount = 0;
    }
    
    
    
    @Override
    public void add(String characterString) {
        if (this.words.contains(characterString)) {
            this.duplicatedCount++;
        }
        this.words.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicatedCount;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        Set<String> unique = new HashSet<String>();
        for (String string : this.words) {
            if (!unique.contains(string)) {
                unique.add(string);
            }
        }
        return unique;
    }

    @Override
    public void empty() {
        this.words.removeAll(words);
        this.duplicatedCount = 0;
    }
    
    
    
}
