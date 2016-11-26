package ex567;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * File IO operations.
 * Use ArrayList to read and overwrite file.
 *
 * Created by Denis on 24.11.2016.
 */
public class HumanFileIO {
    private ArrayList<Human> humans;

    public HumanFileIO(ArrayList<Human> humans) {
        this.humans = humans;
    }

    // Read string from file, parse by delimiter "|"
    public void read(File file) {
        String inputString;
        try (FileInputStream inputStream = new FileInputStream(file)) {
            Scanner scanner = new Scanner(inputStream);

            while (scanner.hasNext()) {
                Human human = new Human();
                inputString = scanner.nextLine();
                String[] splits = inputString.split("\\|");
                human.setFirstName(splits[0]);
                human.setLastName(splits[1]);
                human.setAge(Integer.parseInt(splits[2]));
                humans.add(human);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Write storage array to file
    public void write(File file) {
        StringBuilder out;
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            for (int i = 0; i < humans.size(); i++) {
                out = new StringBuilder();
                out.append(humans.get(i).getFirstName()).append("|")
                        .append(humans.get(i).getLastName()).append("|")
                        .append(humans.get(i).getAge()).append("\r\n");


                outputStream.write(String.valueOf(out).getBytes());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

