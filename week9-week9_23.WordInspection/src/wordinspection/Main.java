package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        // test your code here
        
        /*File file = new File("src/wordList.txt");
        try {
        WordInspection word = new WordInspection(file);
        System.out.println(word.wordCount());
        System.out.println(word.wordsContainingZ());
        System.out.println(word.wordsEndingInL());
        System.out.println(word.palindromes());
        System.out.println(word.wordsWhichContainAllVowels());
        }
        catch (FileNotFoundException e) {
            System.out.println("Wrong file name");
            System.out.println(e.getMessage());
        }
         //all words are in file src/wordList.txt*/
        File file = new File("src/shortList.txt");
    }
}

