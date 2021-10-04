package com.company;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input the string: ");
            String str = in.nextLine();
            System.out.print("Number of  Vowels: " + Vowels(str));
        }
        public static int Vowels(String str)
        {
            int c = 0,i;
            for(i = 0;i<str.length();i++)
            {
                if(str.charAt(i) =='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') c++;
            }
            return c;
        }
    }
