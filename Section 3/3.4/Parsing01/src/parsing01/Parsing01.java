package parsing01;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate    = "0.05";
        String gibberish  ="887ds7nds87dsfs";      
        
        double total;
        
        //Parse shirtPrice and taxRate, and print the total tax
        total = Double.parseDouble(taxRate) * Integer.parseInt(shirtPrice);
        System.out.println(total);
        
              
        //Try to parse taxRate as an int
        //int inttaxRate    = Integer.parseInt(taxrate); 
        
         
        //Try to parse gibberish as an int
        //int intgibberish  =Interger.parseInt(gibberrish); 
        
        
    }
    
}
