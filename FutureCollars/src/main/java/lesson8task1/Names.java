package lesson8task1;

import java.util.*;

public class Names {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota",
                "Piotr");
        System.out.println("List without duplicates: " + getListWithoutDuplicates(names));
        System.out.println("List reversed: " + getListInReverseOrder(names));
        System.out.println("List after change: " + getListWithReplacedNames(names));
    }

    private static List<String> getListWithoutDuplicates(List<String> names) {
        return new ArrayList<>(new HashSet<>(names));
    }

    private static List<String> getListInReverseOrder(List<String> names) {
        List<String> namesCopied = new ArrayList<>(names);
        Collections.reverse(namesCopied);
        return namesCopied;
    }

    private static List<String> getListWithReplacedNames(List<String> names) {
        List<String> namesCopied = new ArrayList<>(names);
        Collections.replaceAll(namesCopied, "Anna", "Joanna");
        return namesCopied;
    }
}