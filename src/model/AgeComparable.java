package model;

/**
 * Created by jc258876 on 11/05/15.
 */
public interface AgeComparable {
    boolean same(Person other);
    boolean younger(Person other);
    boolean older(Person other);
}
