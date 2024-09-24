package corejava.javaExample;

import java.util.Scanner;

public class IfElseIF {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String city = sc.nextLine();
        if(city == "Meerut") {
            System.out.println("city is meerut");
        }else if (city == "Noida") {
            System.out.println("city is noida");
        }else if(city == "Agra") {
            System.out.println("city is agra");
        }else {
            System.out.println("city is: " +city);
        }
    }
}
