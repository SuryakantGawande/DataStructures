package collections;

import java.util.*;

    public class ListExample {
        public static void main(String[] args) {
            // Creating a List of Strings
            List<String> fruits = new ArrayList<>();

            // Adding elements to the list
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Cherry");
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Cherry");


            // Printing the list
            System.out.println("List of fruits: " + fruits);

            // Accessing elements by index
            System.out.println("First fruit: " + fruits.get(0));
            System.out.println("Second fruit: " + fruits.get(1));

            // Iterating over the list
            System.out.println("Iterating over the list:");
            for (String fruit : fruits) {
                System.out.println(fruit);
            }

            // Removing an element
            fruits.remove("Banana");
            System.out.println("After removing Banana: " + fruits);

            // Checking size and emptiness
            System.out.println("Size of the list: " + fruits.size());
            System.out.println("Is the list empty? " + fruits.isEmpty());

            // Clearing the list
            fruits.clear();
            System.out.println("After clearing the list: " + fruits);
        }
    }
