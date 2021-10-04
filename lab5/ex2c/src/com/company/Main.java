package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number:");
        String number = in.nextLine();

	System.out.print("Input type of initial number(hexadecimal - 1, binary - 2, decimal - 3):");
        int type1 = in.nextInt();
        System.out.print("Input type of converted number(hexadecimal - 1, binary - 2, decimal - 3):");
        int type2 = in.nextInt();


        String digits = "0123456789ABCDEF";
        int value = 0;
        if(type1 == 3) value = Integer.parseInt(number);
        char c;
        int d;
    if(type1 == 1) {
        for (int i = number.length() - 1; i >= 0; i = i - 1) {
            c = number.charAt(i);
            d = digits.indexOf(c);
            value = 16 * value + d;
        }
    }
        if(type1 == 2) {
            for (int i = number.length() - 1; i >= 0; i = i - 1) {
                c = number.charAt(i);
                d = digits.indexOf(c);
                value = 2 * value + d;
            }
        }
        if(type2 == 3) System.out.print(value);
        if(type2 == 1) {
            String str = Integer.toHexString(value);
            System.out.print(str);
        }
        if(type2 == 2)
        {
            System.out.println(Integer.toBinaryString(value));
        }
    }
}
