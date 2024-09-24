package Programs.javabasic;
class Animal2 {
    void sound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog2 extends Animal2 {
    @Override
    void sound() {

        System.out.println("The dog barks.");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal2 myAnimal = new Dog2(); // Upcasting
        myAnimal.sound(); // Calls Dog's overridden method
    }
}
