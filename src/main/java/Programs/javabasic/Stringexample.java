package Programs.javabasic;

public class Stringexample {
    public static void main(String[] args) {
        System.out.println("== compare refrence. works for primitives and object");
        System.out.println("equals() compare object content. used for objects");
        String a= new String("Java");
        String b= new String("Java");
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
