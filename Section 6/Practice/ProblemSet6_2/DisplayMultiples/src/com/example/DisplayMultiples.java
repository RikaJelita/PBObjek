
package com.example;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int input = in.nextInt();
        for(int i = 1; i <= 12; i++){
        int multiples = input * i;
        System.out.println("The Number is " + multiples);
        } 
    }

}
