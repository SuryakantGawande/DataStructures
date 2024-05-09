package corejava.String.example;

public class StringExample
{
public static void main(String args[]){

    String s="java";// creating string by java string literal
    char ch[]={'s','t','r','i','n','g'};
    String s2=new String(ch);//converting char array to string
    String s3=new String("example");//creating Java string by new keyword
    System.out.println(s);
    System.out.println(ch);
    System.out.println(s2);
    System.out.println(s3);
}
}
