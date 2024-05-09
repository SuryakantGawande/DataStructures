package corejava.String.example;

public class Stringmethod2 {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Javatpoint";
        String str3 = "Reader";

        System.out.println(str1.equals(str2)); // false because content is same
        // Concatenating one string
        String str4 = str1.concat(str2);
        System.out.println(str4);

        // Concatenating multiple strings
        String str5 = str1.concat(str2).concat(str3);
        System.out.println(str5);


        String name="what do you know about me";
        System.out.println(name.contains("do you know"));
        System.out.println(name.contains("about"));
        System.out.println(name.contains("hello"));

        System.out.println(name.endsWith("e"));
        System.out.println(name.endsWith("me"));
    }
}
