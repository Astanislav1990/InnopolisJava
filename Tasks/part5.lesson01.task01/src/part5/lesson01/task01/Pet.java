package part5.lesson01.task01;

import java.util.Map;
import java.util.Objects;

public class Pet {
    private int id;
    private String animalName;
    private Person person;
    private double weight;

    public Pet(String animalName, Person person, double weight) {
        this.animalName = animalName;
        this.id = this.hashCode();
        this.person = person;
        this.weight = weight;
    }

    public String getAnimalName() {
        return animalName;
    }


    public Person getPerson() {
        return person;
    }

    public double getWeight() {
        return weight;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", animalName='" + animalName + '\'' +
                ", person=" + person +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return id == pet.id &&
                Double.compare(pet.weight, weight) == 0 &&
                Objects.equals(animalName, pet.animalName) &&
                Objects.equals(person, pet.person);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, animalName, person, weight);
    }
}

