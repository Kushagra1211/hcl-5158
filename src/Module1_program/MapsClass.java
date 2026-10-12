package Module1_program;
import java.util.*;
public class MapsClass {

    public static void main(String[] args) {
    Map<Integer,String> mp = new HashMap<>();
    mp.put(1,"sumit");
    mp.put(2,"umit");
    mp.put(3,"sujit");
    mp.put(4,"amit");
        System.out.println("Map: " + mp);

        System.out.println("Value of 1: " + mp.get(1));

        System.out.println("Contains key 2: " + mp.containsKey(2));

        System.out.println("Contains value Sumit: " + mp.containsValue("Sumit"));

        System.out.println("Size: " + mp.size());

        mp.put(102, "Rohan");
        System.out.println("After update: " + mp);

        mp.putIfAbsent(105, "Simran");
        System.out.println("After putIfAbsent: " + mp);

        mp.remove(1);
        System.out.println("After remove: " + mp);

        System.out.println("Keys: " + mp.keySet());

        System.out.println("Values: " + mp.values());

        System.out.println("Entries: " + mp.entrySet());

        System.out.println("Is empty: " + mp.isEmpty());

        System.out.println("Traversing Map:");

        for (int key: mp.keySet()) {
            System.out.println(key + " -> " + mp.get(key));
        }
        mp.clear();
        System.out.println("After clear: " + mp);
    }
}


