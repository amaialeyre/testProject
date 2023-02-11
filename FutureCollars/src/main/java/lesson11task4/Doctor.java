package lesson11task4;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Doctor {

    public static void main(String[] args) {
        List<String> specializations = Arrays.asList("Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra",
                "Przychodnia:Pediatra", "Przychodnia:Internista:Laryngolog:Pediatra");

        Set<String> uniqueSpecializations = getUniqueSpecializations(specializations);
        System.out.println(uniqueSpecializations);
    }

    private static Set<String> getUniqueSpecializations(List<String> specializations) {
        return specializations.stream()
                .flatMap(s -> Arrays.stream(s.split(":")))
                .filter(s -> !s.equals("Szpital") && !s.equals("Przychodnia"))
                .collect(Collectors.toSet());
    }
}