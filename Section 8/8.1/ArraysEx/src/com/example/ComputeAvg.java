
package com.example;

import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        int nilai []= new int [5];
        int total =0 , rata = 0;
        
        Scanner sn = new Scanner (System.in);
        System.out.println("Masukkan nilai 5 orang siswa: ");
            for(int i = 0; i < nilai.length; i++) {
            nilai[i] = sn.nextInt();
            }
            
            for(int i = 0; i < nilai.length; i++) {
            total = total + nilai[i];
            rata = total / nilai.length;
            }
        System.out.println("Nilai rata-rata siswa: " + rata);
    }

}
