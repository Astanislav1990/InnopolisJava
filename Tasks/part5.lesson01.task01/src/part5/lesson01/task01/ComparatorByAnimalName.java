package part5.lesson01.task01;

import java.util.Comparator;

public class ComparatorByAnimalName implements Comparator<Pet> {
    @Override
    public int compare(Pet o1, Pet o2) {
        String animalNameFirst = o1.getAnimalName();
        String animalNameSecond = o2.getAnimalName();
        return animalNameFirst.compareTo(animalNameSecond);
    }
}
