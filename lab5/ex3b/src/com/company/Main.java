package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[20];
        System.out.print("Initial array: ");
        for(int i = 0;i<10;i++)
        {
            A[i] = i+1;
            System.out.print(A[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.print("Input number: ");
        int n = in.nextInt();

        System.out.print("Input position: ");
        int p = in.nextInt();

        System.out.println(" ");
        System.out.print("Array with inserted number: ");

        for(int i = 10; i>= p-1; i--)
        {
            A[i+1] = A[i];
        }
        A[p-1] = n;

        for(int i = 0; i<= 10; i++)
        {
            System.out.print(A[i]);
            System.out.print(" ");
        }
    }
}