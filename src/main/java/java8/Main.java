package java8;

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

