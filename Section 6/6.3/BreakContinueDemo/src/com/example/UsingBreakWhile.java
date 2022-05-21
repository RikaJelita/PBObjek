
package com.example;


public class UsingBreakWhile {
    public static void main(String[] args) {
        
        int i=0;
        while(i < 10)
            if (i == 4) {
                break;
            }
            System.out.println(i + "\t");
            i++;
        }

    }
    

