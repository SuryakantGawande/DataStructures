package collections;

import java.util.*;

    public class HashSetExample {
        public static void main(String[] args) {
            // Creating a HashSet
            Set<String> hashSet = new HashSet<>();

            // Adding elements
            hashSet.add("Apple");
            hashSet.add("Banana");
            hashSet.add("Cherry");
            hashSet.add("Apple");
            hashSet.add("Banana");
            hashSet.add("Cherry");

            // Printing the set
            System.out.println("HashSet: " + hashSet);

            // Checking if an element exists
            boolean containsBanana = hashSet.contains("Banana");
            System.out.println("Contains 'Banana': " + containsBanana);

            // Removing an element
          //  hashSet.remove("Cherry");

            // Iterating over elements
            System.out.println("Iterating over elements:");
            for (String element : hashSet) {
                System.out.println(element);
            }
        }
    }
