package homework22;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lastNames = new ArrayList<>(Arrays.asList("Bandera", "Petlyura", "Melnik", "Konovalets",
                "Klyachivskiy", "Shuhevich", "Kuk", "Skoropadskiy", "Bandera", "Gandzyuk", "Bolbochan", "Ostrogradskiy",
                "Bilinskiy", "Bandera", "Tytyinnik", "Kossac", "Petlyura", "Chuchupapaka", "Konovalets",
                "Gorlis-Gorskiy"));
        Map<String, Integer> lastNamesMap = lastNames.stream().collect(Collectors.toMap(x -> x, x ->
                Collections.frequency(lastNames, x), (oldValue, newValue) -> oldValue));
        System.out.println(lastNamesMap);

        List<Integer> integersList = new ArrayList<>();
        for(int i = 0; i < 50; i++){
            integersList.add(new Random().nextInt(1000));
        }
        long result = integersList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(result);
    }
}
