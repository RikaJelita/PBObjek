
package com.example;

public class ScholarshipIf {

    public static void main(String[] args) {
        int numberDaysAbsent = 0;
        int grade = 65;
        if (grade >= 88) {
            if (numberDaysAbsent == 0) {
                System.out.println("You qualify for the scholarship.");
            } 
            
            else {
                System.out.println("You do not qualify for the scholarship.");
            }

        }
        else {
                System.out.println("You do not qualify for the scholarship.");
            }
    }

}
