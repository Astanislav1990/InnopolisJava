package part5.lesson01.task01;

import java.util.Comparator;

public class ComparatorByPerson implements Comparator<Pet> {

    @Override
    public int compare(Pet o1, Pet o2) {
        String personNameFirst = o1.getPerson().getName();
        String personNameSecond = o2.getPerson().getName();
        return personNameFirst.compareTo(personNameSecond);
    }
}
