package Programs.javabasic;
class AnimalB{
    void eat(){
        System.out.println("This animal is eating");
    }
}
class dog extends AnimalB {
    void bark(){
        System.out.println("is barking");
    }
}


public class InheritanceExample {
    public static void main(String[] args) {
       dog d=new dog();
       d.bark();
       d.eat();
    }
}
