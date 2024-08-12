package java8.useof_lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SimpleComparatorExample {
    public static void main(String[] args) {
        // List of integers
        List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 1);

        // Sort in ascending order using lambda expression
        numbers.sort(Integer::compare);
        System.out.println("Sorted in ascending order: " + numbers);

        // Sort in descending order using lambda expression
        numbers.sort((n1, n2) -> Integer.compare(n2, n1));
        System.out.println("Sorted in descending order: " + numbers);
    }
}
