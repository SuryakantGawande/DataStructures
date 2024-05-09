package corejava.javaExample;

import java.util.Scanner;

public class SwitchExample {
        public static void main(String[] args) {
           // int num = 1;

            Scanner sc= new Scanner(System.in);
            System.out.println("enter your Roommate Name Name: ");
            String name = sc.nextLine();  // Read user input

            switch (name){
                case "Ajay":
                    System.out.println("Ajay Divekar\n Mo:973884832");
                    break;
                case "Amol":
                    System.out.println("Amol Tambe\n Mo:9847662654");
                    break;
                case "Rahul":
                    System.out.println("Rahul narayankar\n Mo:8765423456");
                    break;
                case "Gaganraj":
                    System.out.println("Gaganraj\n Mo: 8765948997");
                    break;
                default:
                    System.out.println(name);
            }
        }
    }

