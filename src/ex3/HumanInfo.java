package ex3;

/**
 * Created by Denis on 24.11.2016.
 */
public class HumanInfo {
    Human human;

    public HumanInfo(Human human) {
        this.human = human;
    }

    public void printName() {
        System.out.printf("%s %s\n", human.getFirstName(),
                human.getLastName());
    }

    public void printPhone() {
        System.out.printf("%s\n", "Telephone number:",
                human.getPhoneNumber());
    }

    public void printAddress() {
        System.out.printf("%s\n", "Address:",
                human.getAddress());
    }
}