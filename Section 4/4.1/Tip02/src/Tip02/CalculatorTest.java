
package Tip02;

public class CalculatorTest {
    public static void main(String[] args) { 
        //Instantiate a Calculator object
        Calculator calcu = new Calculator();
        
        //Access the Calculator object's fields and methods
        //to find the total for each member of the birthday party
         

        //This is what everyone owes before tax and tip:
        //Person 1: $10
        calcu.originalPrice = 10;
        calcu.findTotal();
        
        //Person 2: $12
        calcu.originalPrice = 12;
        calcu.findTotal();
        
        //Person 3: $9
        calcu.originalPrice = 9;
        calcu.findTotal();
        
        //Person 4: $8
        calcu.originalPrice = 8;
        calcu.findTotal();
        
        //Person 5: $7
        calcu.originalPrice = 7;
        calcu.findTotal();    
        
        //Person 6: $15 (Alex)
        calcu.originalPrice = 15;
        calcu.findTotal();
        
        //Person 7: $11
        calcu.originalPrice = 11;
        calcu.findTotal();
        
        //Person 8: $30
        calcu.originalPrice = 30;
        calcu.findTotal();        
        
    }
}
