package collections;
import java.util.*;
public class HashMapExample {
        public static void main(String[] args) {
            // Creating a HashMap
            Map<String, Integer> hashMap = new HashMap<>();

            // Adding key-value pairs
            hashMap.put("Apple", 10);
            hashMap.put("Banana", 20);
            hashMap.put("Cherry", 30);
            hashMap.put("Apple", 14);
            hashMap.put("Ch", 30);

//            // Accessing a value
//            int value = hashMap.get("Banana");
//            System.out.println("Value for 'Banana': " + value);

//            // Removing a key-value pair
//            hashMap.remove("Cherry");
//
//            // Checking if a key exists
//            boolean containsKey = hashMap.containsKey("Apple");
//            System.out.println("Contains key 'Apple': " + containsKey);

            // Iterating over key-value pairs
            System.out.println("Iterating over key-value pairs:");
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());



            }
        }
    }
