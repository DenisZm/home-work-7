package ex567.test;

import ex567.Human;
import ex567.HumanFileIO;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Denis on 24.11.2016.
 */
public class TestHumanFileIO {
    public static void main(String[] args) {

        File file = new File("C:/Work/test-humans.txt");
        ArrayList<Human> humans = new ArrayList<>();
        ArrayList<Human> humans2 = new ArrayList<>();

        Human h1 = new Human();
        Human h2 = new Human();

        h1.setFirstName("Ivan");
        h1.setLastName("Ivanov");
        h1.setAge(17);
        humans.add(h1);

        h2.setFirstName("Petr");
        h2.setLastName("Petrov");
        h2.setAge(41);
        humans.add(h2);

        HumanFileIO io = new HumanFileIO(humans);
        io.write(file);

        HumanFileIO io2 = new HumanFileIO(humans2);
        io2.read(file);


        System.out.println(humans2.get(0).getFirstName());
        System.out.println(humans2.get(0).getLastName());
        System.out.println(humans2.get(0).getAge());
        System.out.println(humans2.get(1).getFirstName());
        System.out.println(humans2.get(1).getLastName());
        System.out.println(humans2.get(1).getAge());

    }
}
