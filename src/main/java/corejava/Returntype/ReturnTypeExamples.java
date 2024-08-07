package corejava.Returntype;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReturnTypeExamples {

    public static void main(String[] args) {
        ReturnTypeExamples examples = new ReturnTypeExamples();

        // Primitive type return example
        int sum = examples.add(10, 20);
        System.out.println("Sum: " + sum);

        // Object type return example
        String greeting = examples.getGreeting();
        System.out.println("Greeting: " + greeting);

        // void return example
        examples.printMessage("Hello, world!");

        // Generic type return example
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        String firstName = examples.getFirstElement(names);
        System.out.println("First name: " + firstName);

        // Array type return example
        int[] numbers = examples.getNumbers();
        System.out.print("Numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Custom object type return example
        Date currentDate = examples.getCurrentDate();
        System.out.println("Current Date: " + currentDate);
    }

    // Primitive type return example
    public int add(int a, int b) {
        return a + b;
    }

    // Object type return example
    public String getGreeting() {
        return "Hello, world!";
    }

    // void return example
    public void printMessage(String message) {
        System.out.println(message);
    }

    // Generic type return example
    public <T> T getFirstElement(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    // Array type return example
    public int[] getNumbers() {
        return new int[]{1, 2, 3, 4, 5};
    }

    // Custom object type return example
    public Date getCurrentDate() {
        return new Date();
    }
}
