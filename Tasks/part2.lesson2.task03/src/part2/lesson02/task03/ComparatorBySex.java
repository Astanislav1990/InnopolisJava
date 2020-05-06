package part2.lesson02.task03;

import java.util.Comparator;

public class ComparatorBySex implements Comparator<Person>{


    @Override
    public int compare(Person o1, Person o2) {
        String s1 = o1.sex.name();
        String s2 = o2.sex.name();
        return s2.compareTo(s1);
    }
}
