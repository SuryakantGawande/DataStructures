package java8.useof_lambda;

import java.util.Arrays;
import java.util.List;

interface Calculator {
    // Static method in the interface
    static int multiply(int a, int b) {
        return a * b;
    }

    // Default method in the interface
    default int add(int a, int b) {
        return a + b;
    }

    // Abstract method (to be implemented by the implementing class)
    int subtract(int a, int b);
}

public class LambdaExample implements Calculator {
    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        LambdaExample calculator = new LambdaExample();

        // Using the static method from the interface
        int resultMultiply = Calculator.multiply(4, 5);
        System.out.println("Multiplication: " + resultMultiply); // Output: Multiplication: 20

        // Using the default method from the interface
        int resultAdd = calculator.add(4, 5);
        System.out.println("Addition: " + resultAdd); // Output: Addition: 9

        // Using the implemented abstract method
        int resultSubtract = calculator.subtract(10, 5);
        System.out.println("Subtraction: " + resultSubtract); // Output: Subtraction: 5

        // Using a lambda expression with Java 8's functional interface
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(n -> System.out.println("Number: " + n));

    }
}

