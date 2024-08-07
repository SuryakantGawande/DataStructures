package oops;

class Stud {
    int id=10;
    String name="surya";
}
//Creating another class TestStudent1 which contains the main method
class TestStudent1{
    public static void main(String args[]){
        Stud s1=new Stud();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}