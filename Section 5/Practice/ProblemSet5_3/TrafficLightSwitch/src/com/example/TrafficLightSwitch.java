
package com.example;
import java.util.Scanner;
        
public class TrafficLightSwitch {

    public static void main(String args[]) {
    Scanner sn = new Scanner (System.in);
       System.out.print("Enter a Color Code: ");
       int currentColor = sn.nextInt();
       
       switch (currentColor){
       case 1 : System.out.print("Next Traffic Light is green");
        break;
       case 2 : System.out.print("Next Traffic Light is Yellow");
        break;
       case 3 : System.out.print("Next Traffic Light is Red");
        break;
       default : System.out.print("Invalid COlor");
    }
       
    }

}
