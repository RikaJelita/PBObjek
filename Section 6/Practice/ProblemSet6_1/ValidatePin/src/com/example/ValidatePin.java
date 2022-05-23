
package com.example;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pin = 520;
        System.out.print("Enter Your PIN: ");
        int input = in.nextInt();
            
        while(input != pin){
        System.out.println("You Entered a Wrong PIN");
        System.out.print("Enter Your PIN: ");
        input = in.nextInt();
            }
        System.out.print("You Can Access Your Account ");
        
              
    }
}



        