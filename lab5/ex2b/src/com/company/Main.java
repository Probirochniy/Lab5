package com.company;
import java.util.Scanner;
public class Main {



        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            time start = new time();
            time end = new time();
            System.out.println("Input initial hours, minutes and seconds:");
            start.hour = in.nextInt();
            start.min = in.nextInt();
            start.sec = in.nextInt();

            System.out.println("Input final hours, minutes and seconds:");
            end.hour = in.nextInt();
            end.min = in.nextInt();
            end.sec = in.nextInt();

            if(end.min<start.min)
            {
                start.hour--;
                end.min += 60;
            }
            if(end.sec<start.sec)
            {
                start.min--;
                end.sec += 60;
            }
            System.out.print("Difference:");
            System.out.print(end.hour-start.hour);
            System.out.print(":");
            System.out.print(end.min-start.min);
            System.out.print(":");
            System.out.print(end.sec-start.sec);
        }
    }
