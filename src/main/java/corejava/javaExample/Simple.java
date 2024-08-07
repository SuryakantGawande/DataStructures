package corejava.javaExample;

public class Simple {

    static int a=10;// static variable
    void method1(){
        int b=30;// local variable
    }

    public static void main(String args[]){
        System.out.println("oops");

        int data =50;// instance variable

        int c=a+data;
        System.out.println("a="+a);
        System.out.println("data="+ data);
        System.out.println("static variable a="+a+"\n instance variable data="+ data+ "\n addition c="+c);

        int m1=10;
        float m2=40.5f;
        char letterA='a';
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(letterA);

    }
}
