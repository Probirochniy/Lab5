package com.company;

public class Main {

    public static void main(String[] args) {
        char ch = 'a';
        int num, i;
        num = ch;
        for (i = 0; i < 26; i++) {
            ch = (char)('a'+i);
            System.out.print(ch);
            System.out.print(" = ");
            System.out.println(num);
            num = num + 1;
        }
    }
}
