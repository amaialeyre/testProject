package lesson4task8;

import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private final int age;
    private final String ssn;

    public Person(String name, String surname, int age, String ssn) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.ssn = ssn;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Person))
            return false;
        Person p = (Person) o;
        return Objects.equals(name, p.name) && Objects.equals(surname, p.surname) && age == p.age && Objects.equals(ssn, p.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, ssn);
    }
}
