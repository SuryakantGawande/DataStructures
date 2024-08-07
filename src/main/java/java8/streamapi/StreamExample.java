package java8.streamapi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // List of Person objects
        List<Person> people = Arrays.asList(
                new Person("Suryakant", 24),
                new Person("Gawande", 17),
                new Person("Alice", 23),
                new Person("Bob", 16),
                new Person("Charlie", 19)
        );

        // Filter out people younger than 18, convert names to uppercase, and collect to a new list
        List<String> adultNames = people.stream()
                .filter(person -> person.getAge() >=18)
                .map(person -> person.getName().toUpperCase())
                .collect(Collectors.toList());

        // Calculate the average age of the remaining people
        double averageAge = people.stream()
                .filter(person -> person.getAge() >= 18)
                .mapToInt(Person::getAge)
                .average()
                .orElse(0.0);

        // Print the results
        System.out.println("Names of adults in uppercase: " + adultNames);
        System.out.println("Average age of adults: " + averageAge);
    }
}
