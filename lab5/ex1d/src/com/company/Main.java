package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    System.out.println("Input 2 strings: ");
    System.out.print("s1: ");
    String s1 = in.nextLine();
    System.out.print("s2: ");
    String s2 = in.nextLine();

    if(s1.length() == s2.length())
    {
        int k = 0;
        for(int i = 0; i < s1.length(); i++)
        {
            char char1 = s1.charAt(0);
            char char2 = s2.charAt(0);
            if(char1!=char2) k = k+1;
        }
        if(k == 0) System.out.print("Lexicographically equal.");
        else System.out.print("Not  lexicographically equal!");
    }
    else System.out.print("Not  lexicographically equal!");

    }
}
