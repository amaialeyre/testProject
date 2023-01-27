package lesson8task1;

import java.util.*;

public class ListOfNames {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr"));
    }

    public static void printList(List<String> names) {
        System.out.println(names);
    }

    public static List<String> printListWithoutDuplicates(List<String> names) {
        return new ArrayList<>(new HashSet<>(names));
    }

    public static void printListInReverseOrder(List<String> names) {
        Collections.reverse(names);
        System.out.println(names);
    }

    public static void printListWithReplacedNames(List<String> names) {
        Collections.replaceAll(names, "Anna", "Joanna");
        System.out.println(names);
    }
}
