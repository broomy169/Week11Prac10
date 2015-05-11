package model;

/**
 * Created by jc258876 on 11/05/15.
 */
public class Person implements AgeComparable, Comparable<Person> {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " + name;
    }

    @Override
    public boolean same(Person other) {
        return other.age == age;
    }

    @Override
    public boolean younger(Person other) {
        return age < other.age;
    }

    @Override
    public boolean older(Person other) {
        return age > other.age;
    }

    @Override
    public int compareTo(Person o) {
        if (age == o.age) {
            return 0;
        }else if (age < o.age) {
            return -1;
        } else {
            return 1;
        }
    }
}
