package corejava.String.example;

public class Smethods {

        public static void main(String args[]){
            String name="javatpoint";
            char ch=name.charAt(4);//returns the char value at the 4th index4
           // char ch=name.charAt(10);//java.lang.StringIndexOutOfBoundsException:
            System.out.println(ch);

            String s1="hello";
            String s2="hello";
            String s3="meklo";
            String s4="hemlo";
            String s5="flag";
            System.out.println(s1.compareTo(s2));//0 because both are equal
            System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"
            System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"
            System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"
        }}

