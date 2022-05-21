
package com.example;

public class ContinueFor {
    

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 4) {
                continue; //control jumps to update i++
            }
            System.out.print(i + "\t");
        }

    }
}

    

