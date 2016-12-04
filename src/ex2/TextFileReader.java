package ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Denis on 24.11.2016.
 */
public class TextFileReader {
    private File file;

    public TextFileReader(File file) {
        this.file = file;
    }

    public String getContentAsString() throws IOException {
        StringBuilder allText = new StringBuilder();
        try (FileInputStream inputStream = new FileInputStream(this.file)){
            Scanner scanner = new Scanner(inputStream);

            while (scanner.hasNext()) {
                allText.append(scanner.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            throw new IllegalStateException("File not found");
        }
        return String.valueOf(allText);
    }
}
