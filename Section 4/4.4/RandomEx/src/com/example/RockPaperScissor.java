
package com.example;

import java.util.Random;


public class RockPaperScissor {

    public static void main(String[] args) {
       
        Random rand = new Random();
        int chance = rand.nextInt(3);
        System.out.println(chance);
                
        if(chance == 0){
        System.out.println("rock");}
        if(chance == 1){
        System.out.println("paper");}
        if(chance == 2){
        System.out.println("scissors");}
        
           

    }
}
