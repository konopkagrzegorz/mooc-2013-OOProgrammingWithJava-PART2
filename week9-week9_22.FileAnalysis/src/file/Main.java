package file;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        // test your code here
    try {
    File file = new File("test/testfile.txt");
    Analysis analysis = new Analysis(file);
    System.out.println("Lines: " + analysis.lines());
    System.out.println("Characters: " + analysis.characters());
    } catch (FileNotFoundException e) {
        System.out.println("File not found!");
        e.printStackTrace();
        }
    }
}
