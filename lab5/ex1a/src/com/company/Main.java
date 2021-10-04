package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x, y, t;
        System.out.println("Enter X and Y");
        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Before:" + x + " " + y);
        t = x;
        x = y;
        y = t;
        System.out.println("After:" + x + " " + y);
    }
}
