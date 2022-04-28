
package com.example;

import java.util.Random;


public class ComputeMethods {
    
public double fToC(double degreesF){
    degreesF = 5/9.0 *(degreesF -32);
    return degreesF;
}
        
public double hypotenuse(int a, int b){
    double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    return c;
}
                
public int roll(){
    Random rnd = new Random();
    int roll1 = rnd.nextInt(6)+1;
    int roll2 = rnd.nextInt(6)+1;
    int tot = roll1 + roll2;
    return tot;
}

 }