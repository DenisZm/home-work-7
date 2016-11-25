package ex567;

import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main program.
 * Store human info. Show file content.
 * Delete records by ID.
 * Created by Denis on 25.11.2016.
 */
public class Main {
    static File file = new File("C:/Work/test-humans.txt");
    static ArrayList<Human> humans = new ArrayList<>();
    static HumanFileIO io = new HumanFileIO(humans);

    public static void main(String[] args) {

        io.read(file);

        boolean exitFlag = false;
        while (!exitFlag) {
            System.out.println("1) Add new human");
            System.out.println("2) Print all humans");
            System.out.println("3) Delete human");
            System.out.println("4) Exit");
            int n = getInputInRange(1, 4);
            switch (n) {
                case 1: addHuman(humans);
                    break;
                case 2: printAll(humans);
                    break;
                case 3: deleteId(humans);
                    break;
                case 4: exitFlag = true;
                    break;
            }
        }
    }

    private static void deleteId(ArrayList<Human> humans) {
        if (humans.size() < 1) {
            System.out.println("Nothing to remove");
            System.out.println();
            return;
        }
        System.out.print("ID: ");
        humans.remove(getInputInRange(0, humans.size() - 1));
        io.write(file);
        System.out.println("Deleted");
        System.out.println();
    }

    private static void printAll(ArrayList<Human> humans) {
        System.out.println();
        for (int i = 0; i < humans.size(); i++) {
            HumanInfo info = new HumanInfo(humans.get(i));
            System.out.printf("ID: %d\n", i);
            info.print();
            System.out.println();
        }
    }

    static void addHuman(ArrayList<Human> humans) {
        Human humanToAdd = new Human();
        System.out.println();

        humanToAdd.setFirstName(getStringFromUser("Enter name: "));
        humanToAdd.setLastName(getStringFromUser("Enter surname: "));
        humanToAdd.setAge(getIntFromUser("Enter age: "));
        humans.add(humanToAdd);

        io.write(file);

        System.out.printf("%s %s  is saved into file!\n",
                humanToAdd.getFirstName(),
                humanToAdd.getLastName());
        System.out.println();
    }

    private static int getIntFromUser(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                Scanner in = new Scanner(System.in);
                return in.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Please input number");
            }
        }
    }

    static String getStringFromUser(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                Scanner in = new Scanner(System.in);
                return in.nextLine();
            } catch (InputMismatchException ex) {
                System.out.println("Please input string");
            }
        }
    }

    static int getInputInRange(int start, int end) {
        int n;
        while (true) {
                n = getIntFromUser("");
                if (n < start || n > end) {
                    sayOutOfRangeoutor(start, end);
                } else {
                    return n;
                }
        }
    }

    static void sayOutOfRangeoutor(int start, int end) {
        if (start == end) {
            System.out.printf("Only %d allowed\n", start);
        } else {
            System.out.printf("Please input number from %d to %d\n", start, end);
        }
    }
}
