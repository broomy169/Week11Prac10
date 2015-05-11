import model.AgeComparable;
import model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jc258876 on 11/05/15.
 */
public class TestInterface {
    public static void main(String[] args) {
        Person person1 = new Person("Jack", 24);
        Person person2 = new Person("Jill", 23);
        System.out.println(person1);
        System.out.println(person2);

        AgeComparable compare = person1;

        System.out.println("Person1 compared to Person2");
        if (compare.same(person2)) {
            System.out.println("Same age");
        } else if (compare.younger(person2)) {
            System.out.println("Younger");
        } else {
            System.out.println("Older");
        }

        List<Person> people = new ArrayList<Person>();
        people.add(person1);
        people.add(person2);

        Collections.sort(people);

        System.out.println(people);
    }
}
