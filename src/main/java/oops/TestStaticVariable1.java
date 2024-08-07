package oops;
//Java Program to demonstrate the use of static variable
class Studentinfo{
    int rollno;//instance variable
    String name;
    static String college ="ITS";//static variable
    //constructor
    Studentinfo(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display the values
    void display (){System.out.println(rollno+" "+name+" "+college);}
}
//Test class to show the values of objects
public class TestStaticVariable1{
    public static void main(String args[]){
        Studentinfo s1 = new Studentinfo(111,"Karan");
        Studentinfo s2 = new Studentinfo(222,"Aryan");
        //we can change the college of all objects by the single line of code
        //Student.college="BBDIT";
        s1.display();
        s2.display();
    }
}