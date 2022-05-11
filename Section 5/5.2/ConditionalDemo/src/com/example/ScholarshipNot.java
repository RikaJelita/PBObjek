
package com.example;

public class ScholarshipNot {

    public static void main(String args[]) {
        int numDaysAbsent = 2;
        int grade = 65;
        boolean madeHonorRoll = grade >= 88;
        if (!madeHonorRoll && numDaysAbsent < 3) {

            System.out.println("You qualify for free tutoring help.");
        } 

        }
    
}
