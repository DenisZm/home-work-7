package ex3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Denis on 24.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human();

        human.setFirstName(getStringFromUser(
                String.format("%-14s", "First name:")));
        human.setLastName(getStringFromUser(
                String.format("%-14s", "Last name:")));
        human.setPhoneNumber(getStringFromUser(
                String.format("%-14s", "Phone number:")));
        human.setAddress(getStringFromUser(
                String.format("%-14s", "Address:")));

        System.out.println();
        HumanInfo info = new HumanInfo(human);
        info.printName();
        info.printPhone();
        info.printAddress();
    }

    private static String getStringFromUser(String prompt) {
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
}
