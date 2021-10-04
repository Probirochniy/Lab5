package com.company;
import java.io.File;
        public class Main {

            public static void main(String[] args) {
                File filedir = new File("/users/doc.txt");
                if (filedir.isDirectory())
                {
                    System.out.println(filedir.getAbsolutePath() + " is a directory");
                }
                else
                {
                    System.out.println(filedir.getAbsolutePath() + " is not a directory");

                }
                if (filedir.isFile())
                {
                    System.out.println(filedir.getAbsolutePath() + " is a file");
                }
                else
                {
                    System.out.println(filedir.getAbsolutePath() + " is not a file");
                }
            }
        }
