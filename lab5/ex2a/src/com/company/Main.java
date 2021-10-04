package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Input temperature in Fahrenheit ");
    int F = in.nextInt();
    int C = (F - 32)*5 ;
    C = C/9;
    System.out.print("temperature in Celsius "+ C);
    }
}
