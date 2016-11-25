package ex1;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Denis on 23.11.2016.
 */

public class Task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Work/test-java.txt");
        file.createNewFile();

        FileOutputStream outputStream = new FileOutputStream(file);
        outputStream.write("Hello, dear student!\nHow are you?".getBytes());
        outputStream.close();

        System.out.println(getAllTextFromFile(file));

        file.delete();
    }

    //TODO: Your implementation of getAllTextFromFile function

    private static String getAllTextFromFile(File file) throws IOException {
        StringBuilder allText = new StringBuilder();
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(inputStream);

            while (scanner.hasNext()) {
                allText.append(scanner.nextLine()).append("\n");
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return String.valueOf(allText);
    }
}