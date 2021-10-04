package com.company;
import java.io.File;
public class Main {

    public static void main(String[] args) {
        File filedir = new File("/users/doc.txt");
        if (filedir.isDirectory())
        {
            System.out.println("Directory " + filedir.getAbsolutePath() + " exist");
        }
        else
        {
            System.out.println("Directory " + filedir.getAbsolutePath() + " does not exist");

        }
        if (filedir.isFile())
        {
            System.out.println("File " + filedir.getAbsolutePath() + " exist");
        }
        else
        {
            System.out.println("File " + filedir.getAbsolutePath() + " does not exist");
        }
    }
}
