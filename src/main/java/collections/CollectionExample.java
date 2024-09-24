package collections;
import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        // Adding elements
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Orange");

        // Checking the size
        System.out.println("Size: " + collection.size()); // Output: Size: 3

        // Iterating over elements
        for (String fruit : collection) {
            System.out.println(fruit);
        }

        // Checking if collection contains an element
        if (collection.contains("Banana")) {
            System.out.println("Collection contains Banana");
        }

        // Removing an element
        collection.remove("Banana");


        // Checking if the collection is empty
        if (collection.isEmpty()) {
            System.out.println("Collection is empty");
        } else {
            System.out.println("Collection is not empty");
        }

        // Clearing the collection
        collection.clear();
        System.out.println("Size after clearing: " + collection.size()); // Output: Size after clearing: 0
    }
}
