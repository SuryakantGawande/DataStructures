package corejava.Returntype;

public class PrimitiveTypeExample {

    public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        PrimitiveTypeExample example = new PrimitiveTypeExample();
        int sum = example.add(10, 20);
        System.out.println("Sum: " + sum);
    }

}
