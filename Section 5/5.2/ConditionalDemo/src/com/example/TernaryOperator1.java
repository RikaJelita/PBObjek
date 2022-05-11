
package com.example;


public class TernaryOperator1 {

    public static void main(String args[]) {
        int numberOfGoals = 5;
        String s = (numberOfGoals == 1 ? "goal" : "goals");
        System.out.println("I scored " + numberOfGoals + " " + s);

    }
}
