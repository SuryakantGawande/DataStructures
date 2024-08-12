package java8;

class MathUtil {
    // Static method to calculate the square of a number
    static int square(int number) {
        return number * number;
    }
}

public class DemoStaticMethod {
    public static void main(String[] args) {
        // Calling the static method directly using the class name
        int result = MathUtil.square(5);
        System.out.println("Square of 5: " + result);  // Output: Square of 5: 25
    }
}
