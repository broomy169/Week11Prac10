package model;

/**
 * Created by jc258876 on 11/05/15.
 */
public class Tally {
    private int value;

    public void reset() { value = 0;}

    @Override
    public String toString() {
        return "Tally: " + value;
    }

    public void increment() {
        value = 0;
    }

    public void increment(int amount) {
        value += amount;
    }
}
