package java8.useof_lambda;

class MyClass implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("hello  " + i);
        }

    }
}
