package part5.lesson01.task01;

/**
 * Разработать программу – картотеку домашних животных. У каждого животного есть уникальный идентификационный номер,
 * кличка, хозяин (объект класс Person с полями – имя, возраст, пол), вес.

 * Реализовать:
 1. метод добавления животного в общий список
    (учесть, что добавление дубликатов должно приводить к исключительной ситуации)
 2. поиск животного по его кличке (поиск должен быть эффективным)
 3. изменение данных животного по его идентификатору
 4. вывод на экран списка животных в отсортированном порядке.
    Поля для сортировки –  хозяин, кличка животного, вес.

 */

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Игорь", "man", 30);
        Person person2 = new Person("Юлия", "woman", 31);
        Person person3 = new Person("Дмитрий", "man", 15);
        Person person4 = new Person("Мария", "woman", 65);
        Person person5 = new Person("Сергей", "man", 12);
        Person person6 = new Person("Елена", "woman", 54);
        Person person7 = new Person("Станислав", "man", 30);


        PetList petList = new PetList();
        petList.add(new Pet("Bars", person1, 6.5));
        petList.add(new Pet("Pers", person2, 7.6));
        petList.add(new Pet("Barns", person3, 24.3));
        petList.add(new Pet("Djek", person4, 12.8));
        petList.add(new Pet("Fast", person5, 8.5));
        petList.add(new Pet("Guram", person6, 7.0));
        petList.add(new Pet("Speedy", person7, 11.5));


//        System.out.println(petList.findByName("Bars"));
        petList.showAllBySort();

    }
}
