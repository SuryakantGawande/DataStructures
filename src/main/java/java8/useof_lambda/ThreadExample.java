package java8.useof_lambda;


public class ThreadExample {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Thread thread = new Thread(myClass);
        thread.run();

        for (int i = 1; i <= 5; i++) {
            System.out.println("byyyy  " + i);
        }
    }
}
