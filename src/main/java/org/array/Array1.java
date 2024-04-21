package org.array;

public class Array1 {
    public static void main(String[] args) {

        int users[] = new int[3];
       users[0] = 97;
       users[1] = 70;
        users[2] = 80;

        System.out.println(users[0]);
        System.out.println(users[1]);
        System.out.println(users[2]);


        int marks[] = {97,98,56};

        for (int i = 0; i < 3; i++) {

            System.out.println(marks[i]);
        }
    }
}