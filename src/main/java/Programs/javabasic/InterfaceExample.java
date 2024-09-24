package Programs.javabasic;

interface Ani{
    void sound(); // Abstract method
}

class Doggi implements Ani {
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Ani myDog = new Doggi();
        myDog.sound();
    }
}
