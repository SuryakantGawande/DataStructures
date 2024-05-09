package corejava.oops.example;
//Java Program to demonstrate the use of a static method.
class St3 {
    int rollno;
    String name;
    static String college = "ITS";
    //static method to change the value of static variable
    static void change(){
        college = "BBDIT";
    }
    //constructor to initialize the variable
    St3(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){System.out.println(rollno+" "+name+" "+college);}
}
//Test class to create and display the values of object
public class TestStaticMethod{
    public static void main(String args[]){
        St3.change();//calling change method
        //creating objects
        St3 s1 = new St3(111,"Karan");
        St3 s2 = new St3(222,"Aryan");
        St3 s3 = new St3(333,"Sonoo");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}