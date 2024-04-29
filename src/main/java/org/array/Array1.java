package org.array;

public class Array1 {
    public static void main(String args[]) {
        int a[] = new int[5];//declaration and instantiation
        a[0] = 10;//initialization
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;
//traversing array     //  Line format Ctl+alt+L
        for (int j : a) System.out.println(j);
        System.out.println("done");
        System.out.println("done 2");
    }
}
