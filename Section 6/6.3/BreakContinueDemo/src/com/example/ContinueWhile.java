
package com.example;


public class ContinueWhile {
    public static void main(String[] args) {
        int i=0;
        int num = 10;
       while(i<10)          // continue jumps here
        {
            if (i == 5 ) {
                continue; // Jumps to condition when i!= 3
            }
            System.out.println(i);
            i++;
        }
    }

    
}
