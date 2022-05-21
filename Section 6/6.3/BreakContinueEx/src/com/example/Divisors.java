package com.example;

import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {
     Scanner console = new Scanner(System.in);
     System.out.print("Enter the number :  ");
      int num = console.nextInt();  // user inputs a number
         
    System.out.print("Divisors of " + num+" "+ "="+" " );

        for (int i = 1; i < num; i++) {
            if (num % i != 0) {
                continue;  //remaining code and restart the loop
            }  //end if
            System.out.print(i + " , ");
        }  //end for 
    }  // end method main
}

//Variabel loop yang digunakan
//Logika loop
//Jumlah pengulangan
//Kondisi yang digunakan 
//Alur kontrol dalam loop