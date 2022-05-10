
package com.example;

import java.util.Scanner;


public class AgeValidity {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner (System.in);
        System.out.print("Enter Your Age: ");
        int age = inputScanner.nextInt();
        
        boolean driverUnderAge;
        driverUnderAge = false;
        
        if(age<=18){
            driverUnderAge = true;
        }
        System.out.println(driverUnderAge);
    }
}
    