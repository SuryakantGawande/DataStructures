package oops;
//Initialization through reference
class Student2{
    int id;
    String name;
}
//Initializing an object means storing data into the object
class TestStudent2{
    public static void main(String args[]){
        Student2 s1=new Student2();
        s1.id=101;
        s1.name="Surya";
        System.out.println(s1.id+" "+s1.name);//printing members with a white space
    }
}