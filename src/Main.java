//Creare un hashmap, prendere tutti i valori, ordinarli e stamparli
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creazione dell'HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Quattro", 4);
        hashMap.put("Due", 2);
        hashMap.put("Uno", 1);
        hashMap.put("Cinque", 5);
        hashMap.put("Tre", 3);

        System.out.println(hashMap);

        // Estrazione dei valori e ordinamento
        List<Integer> values = new ArrayList<>(hashMap.values());
        Collections.sort(values);

        // Stampa dei valori ordinati
        System.out.println("Valori ordinati:");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}