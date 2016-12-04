package ex3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Denis on 24.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human();

        System.out.print(String.format("%-14s", "First name:"));
        human.setFirstName(getStringFromUser());
        System.out.print(String.format("%-14s", "Last name:"));
        human.setLastName(getStringFromUser());
        System.out.print(String.format("%-14s", "Phone number:"));
        human.setPhoneNumber(getStringFromUser());
        System.out.print(String.format("%-14s", "Address:"));
        human.setAddress(getStringFromUser());

        System.out.println();
        System.out.println(human);
    }

    private static String getStringFromUser() {
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                return in.nextLine();
            } catch (InputMismatchException ex) {
                System.out.println("Please input string");
            }
        }
    }
}
