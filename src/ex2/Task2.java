package ex2;

/**
 * Created by Denis on 24.11.2016.
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Work/test-java.txt");
        file.createNewFile();

        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write("Hello, dear student!\nHow are you?".getBytes());
        outputStream.close();

        TextFileReader textFileReader = new TextFileReader(file);
        System.out.println(textFileReader.getContentAsString());

        file.delete();
    }
}