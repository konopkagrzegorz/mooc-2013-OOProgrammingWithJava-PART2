/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Grzegorz Konopka
 */
public class MindfulDictionary {
    
    private Map<String,String> dictionary;
    private File file;

    public MindfulDictionary() {
        this.dictionary = new HashMap<String, String>();
    }
    
    public MindfulDictionary(String file) throws FileNotFoundException {
        this();
        this.file = new File(file);
    }
    
    public void add(String word, String translation) {
        if (!this.dictionary.containsKey(word)) {
            this.dictionary.put(word, translation);
            this.dictionary.put(translation, word);
        }
    }
    
    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        return null;
    }
    
    public void remove(String word) {
            String translated = translate(word);
            this.dictionary.remove(word);
            this.dictionary.remove(translated);
    }
    
    public boolean load() {
        try {
            Scanner scanner = new Scanner(this.file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                this.dictionary.put(parts[0], parts[1]);
                this.dictionary.put(parts[1], parts[0]);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public boolean save() {
        try {
            FileWriter fileWriter = new FileWriter(this.file);
            List<String> wordsAlreadyInFile = new ArrayList<String>();
        for (String word : this.dictionary.keySet()) {
            String translation = this.dictionary.get(word);
            if (!wordsAlreadyInFile.contains(word)) {
                String pair = word + ":" + this.dictionary.get(word);
                fileWriter.write(pair + "\n");
                wordsAlreadyInFile.add(translation);
                }
            }
        fileWriter.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
