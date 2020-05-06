package part2.lesson02.task03;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        String s1 = o1.name.name();
        String s2 = o2.name.name();
        return s2.compareTo(s1);
    }
}
