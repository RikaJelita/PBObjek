
package com.example;
import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
       Scanner sn = new Scanner (System.in);
       System.out.print("Enter a Color Code: ");
       int currentColor = sn.nextInt();
       
       if(currentColor == 1){
       System.out.print("Next Traffic Light is green");
       }
       else if (currentColor == 2){
       System.out.print("Next Traffic Light is Yellow");
       }
       else if (currentColor == 3){
       System.out.print("Next Traffic Light is Red");
       }
        else {
       System.out.print("Invalid color");   
       } 
        
    }

}
