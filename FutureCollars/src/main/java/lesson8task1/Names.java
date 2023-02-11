package lesson8task1;

import java.util.*;

public class Names {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Katarzyna");
        names.add("Tymon");
        names.add("Tadeusz");
        names.add("Anna");
        names.add("Karolina");
        names.add("Dorota");
        names.add("Piotr");

    List<String> uniqueNames = new ArrayList<>();
        for (String name : names) {
        if (!uniqueNames.contains(name)) {
            uniqueNames.add(name);
        }
    }
        System.out.println("List without duplicates: " + uniqueNames);

    List<String> reverseNames = new ArrayList<>();
        for (int i = names.size() - 1; i >= 0; i--) {
        reverseNames.add(names.get(i));
    }
        System.out.println("Elements in reverse order: " + reverseNames);

    String changeFrom = "Anna";
    String changeTo = "Joanna";
        for (int i = 0; i < names.size(); i++) {
        if (names.get(i).equals(changeFrom)) {
            names.set(i, changeTo);
        }
    }
        System.out.println("Elements after change: " + changeFrom + "->" + changeTo + "");
        System.out.println(names);
}
}