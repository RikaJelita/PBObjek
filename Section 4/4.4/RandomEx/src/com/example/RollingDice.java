
package com.example;

import java.util.Random;


public class RollingDice {

    public static void main(String[] args) {
        Random rand = new Random();
        int chance = rand.nextInt(6);
                        
        if(chance == 0){
        System.out.println("Mata Dadu Anda : 1");}
        if(chance == 1){
        System.out.println("Mata Dadu Anda : 2");}
        if(chance == 2){
        System.out.println("Mata Dadu Anda : 3");}
        if(chance == 3){
        System.out.println("Mata Dadu Anda : 4");}
        if(chance == 4){
        System.out.println("Mata Dadu Anda : 5");}
        if(chance == 5){
        System.out.println("Mata Dadu Anda : 6");}
        
    }

}
