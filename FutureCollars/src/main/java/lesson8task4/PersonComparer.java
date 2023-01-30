package lesson8task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparer {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Anna", "Kowal", 1949, 161, 54));
        personList.add(new Person("Katarzyna", "Nowak", 1980, 165, 59));
        personList.add(new Person("Jolanta", "Malinowska", 1956, 167, 68));
        personList.add(new Person("Emilian", "Kulon", 1998, 182, 87));
        personList.add(new Person("Kamil", "Gaj", 1967, 195, 74));
        personList.add(new Person("Mateusz", "Turek", 1997, 187, 95));

        Collections.sort(personList);
        personList.forEach(System.out::println);

        System.out.println();

        personList.sort(Person.heightComparator);
        personList.forEach(System.out::println);

        System.out.println();

        personList.sort(Person.weightComparator);
        personList.forEach(System.out::println);
    }
}