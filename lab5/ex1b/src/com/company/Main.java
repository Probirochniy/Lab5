package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	char ch;
    Scanner in = new Scanner(System.in);
    System.out.print("Input a character: ");
    ch = in.next().charAt(0);
    int value = ch;
    System.out.print("ASCII value: "+value);


    }
}
