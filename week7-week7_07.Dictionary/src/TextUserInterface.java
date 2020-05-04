
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
public class TextUserInterface {
    
    private final Scanner scanner;
    private final Dictionary dictionary;
    
   

    public TextUserInterface(Scanner scanner, Dictionary dictionary) {
      this.scanner = scanner;
      this.dictionary = dictionary;
    }
    
    public void start() {
        printMenu();
        while (true) {
            System.out.print("Statement: ");
            String input = scanner.nextLine();
            input = input.trim().toLowerCase();
            
            if (input.equals("add")) {
                add();
            } else if (input.equals("translate")) {
                translate();
            } else if (input.equals("quit")) {
                break;
            } else {
                System.out.println("Unknown statement");
            }
        }
    }
    
    private void printMenu() {
        System.out.println("Statements:");
        System.out.println("add - adds a word pair to the dictionary");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("quit - quit the text user interface");
        System.out.println("");
    }
    
    public void add() {
        System.out.print("In Finnish: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translated = scanner.nextLine();
        dictionary.add(word, translated);
    }
    
    public void translate() {
        System.out.print("Give a word: ");
        String word = scanner.nextLine();
        System.out.println("Translation: " + dictionary.translate(word));
        
    }
    
    
    
}
