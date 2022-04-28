
package com.example;


public class TestClass {

    public static void main(String args[]) {
        
        //Create an instance of ComputeMethods, 
        ComputeMethods count = new ComputeMethods();
                     
        //invoke the 3 methods and dispay their results
        System.out.println ("Temp in celsius is "+ count.fToC(101));
        System.out.println ("Hypotenuse is " + count.hypotenuse (8,6));
        System.out.println ("The sum of the dice values is : "+ count.roll());
        
        
    }
}
