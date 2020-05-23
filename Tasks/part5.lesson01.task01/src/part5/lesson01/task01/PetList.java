package part5.lesson01.task01;

import java.util.*;

public class PetList {
    private int petId;
    private Map<Integer, Pet> list;

    public PetList() {
        this.list = new HashMap<>();
    }

    public void add(Pet pet) {
        if (list.containsValue(pet)) {
            throw new IllegalArgumentException("Такой питомец уже есть, не ругайся, пожалуйста");

        }
//       Integer key = pet.hashCode();
        int key = petId++;
        pet.setId(key);
        list.put(key, pet);
    }

    public Pet findByName(String petName) {
        for (Map.Entry<Integer, Pet> entry :
                list.entrySet()) {
            Pet currentPet = entry.getValue();
            if (currentPet.getAnimalName().equals(petName)) {
                return entry.getValue();
            }

        }
        return null;

    }

    public boolean changePetParametrs(int petId, String petName, double weight, Person person) {
        if (!list.containsValue(petId)) {
            return false;
        }
        list.get(petId).setAnimalName(petName);
        list.get(petId).setPerson(person);
        list.get(petId).setWeight(weight);
        return true;

    }

    public void showAllBySort() {
        Comparator<Pet> comparatorByPerson = new ComparatorByPerson();
        Comparator<Pet> comparatorByAnimalName = new ComparatorByAnimalName();
        Comparator<Pet> comparatorByWeight = new ComparatorByAnimalWeight();
        List<Pet> petList = new ArrayList<>(this.list.values());
        petList.sort(comparatorByPerson);
        petList.sort(comparatorByAnimalName);
        petList.sort(comparatorByWeight);
        for (Pet pet : petList
        ) {
            System.out.println(pet.toString());
        }
    }


}

