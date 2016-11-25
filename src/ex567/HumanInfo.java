package ex567;

/**
 * Created by Denis on 24.11.2016.
 */
public class HumanInfo {
    Human human;

    public HumanInfo(Human human) {
        this.human = human;
    }

    public void print() {
        System.out.printf("%s %s, %d y.o.\n", human.getFirstName(),
                human.getLastName(),
                human.getAge());
    }
}