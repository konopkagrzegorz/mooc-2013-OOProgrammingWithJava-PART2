/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Grzegorz Konopka
 */
public class Analysis {
    
    private File file;

    public Analysis(File file) throws FileNotFoundException {
        this.file = file;
    }
    
    public int lines() throws FileNotFoundException {
        int counter = 0;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            counter++;
        }
        scanner.close();
        return counter;
    }
    
    public int characters() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String characters = "";
        while (scanner.hasNextLine()) {
            characters += scanner.nextLine();
        }
        scanner.close();
        int length = characters.length() + lines();
        return length;
    }
}

