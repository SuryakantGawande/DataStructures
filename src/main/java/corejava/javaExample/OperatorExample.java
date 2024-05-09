package corejava.javaExample;

public class OperatorExample {
    public static void main(String args[]) {
    int aa=10;
    aa++;
    int bb=10;
    bb--;
    System.out.println(aa);
    System.out.println(bb);



        int a=10;
        int b=5;
        int c=20;
        System.out.println(a+b);//15
        System.out.println(a-b);//5
        System.out.println(a*b);//50
        System.out.println(a/b);//2
        System.out.println(a%b);//0

        System.out.println(10*10/5+3-1*4/2);//21   / * + -
        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10>>2);//10/2^2=10/4=2

        System.out.println(a<b&&a<c);//false && true = false
        System.out.println(a<b&a<c);//false & true = false

        System.out.println(a<b&a++<c);//false && true = false

        System.out.println(a>b||a<c);//true || true = true
        System.out.println(a>b|a<c);//true | true = true

        int min=(a<b)?a:b;
        System.out.println(min);
    }
}