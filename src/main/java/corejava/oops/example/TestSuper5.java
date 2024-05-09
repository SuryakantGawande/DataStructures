package corejava.oops.example;
class Person{
    int id;
    String name;
    Person(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class Employee5 extends Person{
    float salary;
    Employee5(int id,String name,float salary){
        super(id,name);//reusing parent constructor
        this.salary=salary;
    }
    void display(){System.out.println(id+" "+name+" "+salary);}
}
class TestSuper5{
    public static void main(String[] args){
        Employee5 e1=new Employee5(1,"ankit",45000f);
        e1.display();
    }}