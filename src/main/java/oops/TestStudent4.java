package oops;

//initialize through method
class Student4{
    int rollno;
    String name;
    void insertRecord(int r, String n){
        rollno=r;
        name=n;
    }
    void displayInformation(){System.out.println(rollno+" "+name);}
}
class TestStudent4{
    public static void main(String args[]){
        Student4 s1=new Student4();

        s1.insertRecord(111,"Karan");
        //s1.insertRecord(222,"Aryan");
        s1.displayInformation();
       // s1.displayInformation();
    }
}