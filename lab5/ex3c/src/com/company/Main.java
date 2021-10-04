package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input 10 numbers with repeating ones:");
        int[] A = new int[10];
        int[] R = new int[10];
        int c=0,f,k;
        for(int i = 0;i<10;i++)
        {
            R[i] = 132780912;
        }
        for(int i = 0; i<10; i++){
            A[i] = in.nextInt();
        }
        System.out.println("");
        System.out.print("Repeating numbers: ");
        for(int i = 0; i<9; i++){
            for(int j = i+1; j<10; j++) {
                if(A[i] == A[j]) {
                    f = 0;
                    for(k = 0;k<10;k++) {
                        if(A[i]==R[k]) f++;
                    }
                    if(f == 0) {
                        R[c] = A[i];
                        c++;
                        System.out.print(A[i]);
                        System.out.print(" ");
                    }
                }
                }
            }
        }
    }
