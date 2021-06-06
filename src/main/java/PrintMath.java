/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;
public class PrintMath {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String k = "";
        String t = "";
        System.out.print("What is the first number? ");
        k =input.nextLine();
        System.out.print("What is the second number? ");
        t = input.nextLine();

        int a = Integer.parseInt(k);
        int b = Integer.parseInt(t);
        System.out.println(a+" + "+b+" = "+(a+b)+"\n"+a+" - "+b+" = "+(a-b)+"\n"+a+" * "+b+" = "+(a*b)+"\n"+a+" / "+b+" = "+(a/b)+"\n");
    }
}
