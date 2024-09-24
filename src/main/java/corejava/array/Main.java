package corejava.array;

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        //initialize
        int[] a0 = new int[5];
        int[] a1 = {4, 2, 3};

        //Get Length
        System.out.println("The size of a1 is:" + a1.length);

        //Access Element
        System.out.println("The first element is:" + a1[0]);

        //Iterate all element using for loop
        System.out.println("version 1  The contents a1 are:");
        for (int i = 0; i < a1.length; ++i) {
            System.out.println(" " + a1[i]);
        }
        System.out.println();
     //This is an enhanced for loop (also known as a "for-each" loop)
        System.out.print("[Version 2] The contents of a1 are:");
        for (int item : a1) {
            System.out.println(" " +item);
        }


    // 5. Modify Element
    a1[0] = 6;
    // 6. Sort
        System.out.println("sorted array:");
        Arrays.sort(a1);
        for (int item : a1) {
            System.out.println(" " + item);
        }
        Arrays.toString(a1);
        for (int item : a1) {
            System.out.print(" " + item);
        }


    }
}
