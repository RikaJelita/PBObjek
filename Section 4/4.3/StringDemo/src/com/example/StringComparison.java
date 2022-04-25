
package com.example;

public class StringComparison {

    public static void main(String[] args) {
        String s1 = "Susan";
        String s2 = "Susan";
        String s3 = "Robert";
        System.out.println(s1.compareTo(s2));//0  
        System.out.println(s1.compareTo(s3));//1(because s1>s3)  
        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
    }

}
