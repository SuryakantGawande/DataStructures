package Programs.javabasic;
class Dog {
    String name;
    int age;

    void bark() {
        System.out.println(name + " is barking.");
    }
}

public class ClassesAndObject {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Create an object of Dog
        myDog.name = "Buddy";
        myDog.age = 3;
        myDog.bark(); // Call the bark method
    }
}
