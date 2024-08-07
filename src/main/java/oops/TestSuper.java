package oops;

class Animal4 {
    String color = "white";
}
class Dog4 extends Animal4{
    String color="black";

    void printColor(){
        System.out.println(""+color);
        System.out.println(""+super.color);
    }
}
public class TestSuper {
    public static void main(String args[]){
Dog4 d4=new Dog4();
d4.printColor();
    }
}
