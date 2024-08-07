package oops.op.polymorphism.overloading;

class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of two integers: " + calc.add(10, 20));              // Calls add(int, int)
        System.out.println("Sum of two doubles: " + calc.add(2.5, 3.7));            // Calls add(double, double)
        System.out.println("Sum of three integers: " + calc.add(1, 2, 3));          // Calls add(int, int, int)
        System.out.println("Concatenation of two strings: " + calc.add("Hello", " World"));  // Calls add(String, String)
    }
}
