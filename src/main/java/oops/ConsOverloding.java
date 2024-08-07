package oops;

public class ConsOverloding {
    int id;
    String name;
    int age;
    //creating two arg constructor
    ConsOverloding(int i,String n){
        id = i;
        name = n;
    }
    //creating three arg constructor
    ConsOverloding(int i,String n,int a){
        id = i;
        name = n;
        age=a;
    }
    void display() {
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String args[]){
        ConsOverloding s1 = new ConsOverloding(111,"Karan");
        ConsOverloding s2 = new ConsOverloding(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}