package part2.lesson02.task03;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.age - o1.age;
    }
}
