package part2.lesson02.task03;

import java.util.ArrayList;
import java.util.Random;

/**
 * Дан массив объектов Person. Класс Person характеризуется полями age (возраст, целое число 0-100), 
   sex (пол – объект класса Sex со строковыми константами внутри MAN, WOMAN), name (имя - строка). 
	- Создать два класса, методы которых будут реализовывать сортировку объектов. 
	- Предусмотреть единый интерфейс для классов сортировки. 
	- Реализовать два различных метода сортировки этого массива по правилам:
	  1.первые идут мужчины
	  2.выше в списке тот, кто более старший
	 3.имена сортируются по алфавиту
   Программа должна вывести на экран отсортированный список и время работы каждого алгоритма сортировки.
   Предусмотреть генерацию исходного массива (10000 элементов и более).
   Если имена людей и возраст совпадают, выбрасывать в программе пользовательское исключение.
 */

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> personArrayList = new ArrayList<>();
        ComparatorByAge comparatorByAge = new ComparatorByAge();
        ComparatorByName comparatorByName = new ComparatorByName();
        ComparatorBySex comparatorBySex = new ComparatorBySex();

        Random random = new Random();
        Name[] names = Name.values();

        for(int i = 0; i < 50; i ++){
            int age = random.nextInt(10);
            Sex sex;
            if (Math.random() < 0.5){
                sex = Sex.MAN;
            }else{
                sex = Sex.WOMAN;
            }
            Name name;
            if (sex.equals(Sex.MAN)) {
                name = names[random.nextInt(10)];
            } else {
                name = names[random.nextInt(10) + 13];
            }
            personArrayList.add(new Person(age, sex, name));
        }


//        SortByMethod.sort(comparatorByName, personArrayList);
////        for (Person p : personArrayList) {
////            System.out.println(p);
////        }
//        SortByMethod.sort(comparatorByAge, personArrayList);
////        for (Person p : personArrayList) {
////            System.out.println(p);
////        }
//        SortByMethod.sort(comparatorBySex, personArrayList);
//        SortByMethod.checkingForTheSameNameAndAge(personArrayList);
////
//        for (Person p : personArrayList) {
//            System.out.println(p);
//        }


        ArrayList<Person> arr = SortByMethod1.sortMerge(personArrayList, comparatorByName );
        ArrayList<Person> arr1 = SortByMethod1.sortMerge(arr, comparatorByAge );
        ArrayList<Person> arr2 = SortByMethod1.sortMerge(arr1, comparatorBySex );
//        int k = 0;
        SortByMethod.checkingForTheSameNameAndAge(arr2);
        for (Person p : arr2) {
            System.out.println(p);
        }


        int i =0;

    }
}

