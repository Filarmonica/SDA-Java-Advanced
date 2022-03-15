package ro.sda.iulian.interfaces.ex2;

import ro.sda.iulian.generics.ex1.Person;

public interface Comparable {
    int compareToObject(Object o1);

    int compareTo(Person o);
}
