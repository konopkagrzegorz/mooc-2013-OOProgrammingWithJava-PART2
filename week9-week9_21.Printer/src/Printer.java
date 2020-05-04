
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class Printer {
    
    private File file;

    public Printer(String filename) {
        this.file = new File(filename);
    }
    
    public void printLinesWhichContain(String word) throws Exception {
        Scanner scanner = new Scanner(file);
       while (scanner.hasNextLine()) {
           String line = scanner.nextLine();
           if (line.contains(word)) {
               System.out.println(line);
           }
       }
       scanner.close();
    }
}
