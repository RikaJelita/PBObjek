
package com.example;


public class CountChar {


    public static void main(String[] args) {

        String str = "www.oracle.com";

        int max = str.length();
        int count = 0;

//            if (str.charAt(i) != 'w')
//                continue;
        for(int i=0; i<str.length();i++){
            if (str.charAt(i) == 'w') count++;
               continue;
        }

         //count++;
        

        System.out.println("Counting w : " + count );
    }
}

