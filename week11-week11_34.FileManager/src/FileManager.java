
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        ArrayList<String> line = new ArrayList<String>();
        File readFile = new File(file);
        Scanner scanner = new Scanner(readFile);
        
        while (scanner.hasNext()) {
            line.add(scanner.nextLine());
        }
        return line;
    }

    public void save(String file, String text) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(text);
        fileWriter.close();  
    }

    public void save(String file, List<String> texts) throws IOException {
         FileWriter fileWriter = new FileWriter(file);
        for (int i = 0; i < texts.size(); i++) {
            fileWriter.write(texts.get(i) + "\n");
        }
        fileWriter.close();
    }
}
