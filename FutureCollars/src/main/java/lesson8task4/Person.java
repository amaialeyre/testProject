package lesson8task4;

import java.util.Comparator;

public class Person implements Comparable<Person> {

    private final String name;
    private final String surname;
    private final int dateOfBirth;
    private final double height;
    private final double weight;

    public Person(String name, String surname, int dateOfBirth, double height, double weight) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.height = height;
        this.weight = weight;
    }

    public static Comparator<Person> heightComparator = new Comparator<Person>() {
        @Override
        public int compare(Person firstPerson, Person secondPerson) {
            return Double.compare(firstPerson.getHeight(), secondPerson.getHeight());
        }
    };

    public static Comparator<Person> weightComparator = new Comparator<Person>() {
        @Override
        public int compare(Person firstPerson, Person secondPerson) {
            return Double.compare(firstPerson.getWeight(), secondPerson.getWeight());
        }
    };

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(otherPerson.dateOfBirth, this.dateOfBirth);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
