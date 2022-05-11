
package com.example;


public class ScholarshipOr {

    public static void main(String[] args) {
        int numberDaysAbsent = 3;
        int grade = 65;
        if (grade >= 70 || numberDaysAbsent < 5) {
            System.out.println(" You qualify for sports team");
        } else {
            System.out.println(" You do not qualify for sports team");
        }

    }
}