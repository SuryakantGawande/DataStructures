package corejava.ddatatypes;

import java.util.Scanner;

public class GFG {
    public static void main(String[] args) {
        int num;
        System.out.println("enter no");
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();

        System.out.println("entered no is"+num);

        if(num%2==0){
            System.out.println("No is EVEN");
        }
        else {
            System.out.println("num is ODD");
        }
    }
}
