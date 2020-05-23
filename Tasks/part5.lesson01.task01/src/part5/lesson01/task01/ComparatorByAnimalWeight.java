package part5.lesson01.task01;

import java.util.Comparator;

public class ComparatorByAnimalWeight implements Comparator<Pet> {
    @Override
    public int compare(Pet o1, Pet o2) {
        double animalNameFirst = o1.getWeight();
        double animalNameSecond = o2.getWeight();
        return Double.compare(animalNameFirst, animalNameSecond);
    }
}
