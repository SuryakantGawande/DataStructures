package oops;

public class ParaConstructor {
//Java Program to demonstrate the use of the parameterized constructor.
    int id;
    String name;
    //creating a parameterized constructor
    ParaConstructor(int i,String n){
        id = i;
        name = n;
    }
    //method to display the values
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        //creating objects and passing values
        ParaConstructor s1 = new ParaConstructor(111,"Karan");
        ParaConstructor s2 = new ParaConstructor(222,"Aryan");
        //calling method to display the values of object
        s1.display();
        s2.display();
    }
}