package org.array;

import java.util.Scanner;

public class Array2 {
    public static void main(String args[]) {

        System.out.println("Enter Size of Array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.println("Arrays Input:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Arrays Output:");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}