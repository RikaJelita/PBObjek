
package tip03;

public class CalculatorTest {
    public static void main(String[] args) {
        
       Calculator calc = new Calculator();
       
       //Use the Calculator object and arguments supplied to findTotal()
       //to print the total for each person

      
       
       //This is what everyone owes before tax and tip:
       //Person 1: $10
        calc.originalPrice = 10;
        calc.findTotal();
        
       //Person 2: $12
        calc.originalPrice = 12;
        calc.findTotal(); 
        
       //Person 3: $9
        calc.originalPrice = 9;
        calc.findTotal();
        
       //Person 4: $8
        calc.originalPrice = 8;
        calc.findTotal();
        
       //Person 5: $7
        calc.originalPrice = 7;
        calc.findTotal();
        
       //Person 6: $15 (Alex)
        calc.originalPrice = 15;
        calc.findTotal();
        
       //Person 7: $11
        calc.originalPrice = 11;
        calc.findTotal();
        
       //Person 8: $30
        calc.originalPrice = 30;
        calc.findTotal();
               
       
    }    
}
