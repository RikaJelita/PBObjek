package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
       Scanner sn = new Scanner (System.in);
       System.out.print("Enter a Color Code: ");
        double wavelength = sn.nextDouble();
              
       if(wavelength >=380 && wavelength<=450){
       System.out.print("The Color is Violet");
       }
       else if (wavelength >450 && wavelength<=495){
       System.out.print("The Color is Blue");
       }
       else if (wavelength >495 && wavelength<=570){
       System.out.print("The Color is Green");
       }
       else if (wavelength >570 && wavelength<=590){
       System.out.print("The Color is Yellow");
       }
       else if (wavelength >590 && wavelength<=620){
       System.out.print("The Color is Orange");
       }
       else if (wavelength >620 && wavelength<=750){
       System.out.print("The Color is Blue");
       }
       else {
       System.out.print("The entered wavelength is not a part of the visible spectrum");   
       }
    }
}
