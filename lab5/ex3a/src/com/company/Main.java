package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input amount of numbers: ");
	    int n = in.nextInt();
        int[] A = new int[n];
        float sum = 0, avg;
        System.out.println("Input array numbers: ");
    for(int i = 0;i<n;i++)
    {
        A[i] = in.nextInt();
        sum += A[i];
    }
    avg = sum/n;
        System.out.println("Average value: "+avg);
    }
}
