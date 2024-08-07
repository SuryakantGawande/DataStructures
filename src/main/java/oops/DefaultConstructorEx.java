package oops;

//Let us see another example of default constructor
//which displays the default values
public class DefaultConstructorEx {
    int id;
    String name;
    //method to display the value of id and name
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
//creating objects
        DefaultConstructorEx  s1=new DefaultConstructorEx ();
        DefaultConstructorEx  s2=new DefaultConstructorEx ();
//displaying values of the object
        s1.display();
        s2.display();
    }
}