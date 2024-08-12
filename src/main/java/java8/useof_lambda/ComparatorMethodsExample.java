package java8.useof_lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorMethodsExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 30),
                new Person("Dave", 20)
        );

        // Comparator to sort by age
        Comparator<Person> byAge = (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge());

        // Comparator to sort by age in descending order
        Comparator<Person> byAgeDescending = byAge.reversed();

        // Comparator to sort by age, then by name
        Comparator<Person> byAgeThenName = byAge.thenComparing(Person::getName);

        // Sorting and printing
        System.out.println("Sorted by age:");
        people.sort(byAge);
        people.forEach(p -> System.out.println(p.getName() + " - " + p.getAge()));

        System.out.println("\nSorted by age (descending):");
        people.sort(byAgeDescending);
        people.forEach(p -> System.out.println(p.getName() + " - " + p.getAge()));

        System.out.println("\nSorted by age, then name:");
        people.sort(byAgeThenName);
        people.forEach(p -> System.out.println(p.getName() + " - " + p.getAge()));
    }
}

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
