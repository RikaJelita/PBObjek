
package com.example;


import java.util.Scanner;
public class IfElseDemo2 {
    public static void main(String[] args){
Scanner in = new Scanner(System.in);
String name = "";
System.out.println("Enter your name:");
name = in.next();
if( name.equals("Elvis"))
    System.out.println("You are the king of rock and roll");

else
    System.out.println("You are not the king");

    
}
}
