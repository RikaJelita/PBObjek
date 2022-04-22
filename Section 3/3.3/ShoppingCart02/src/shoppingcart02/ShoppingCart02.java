
package shoppingcart02;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double harga = 50;
        double pajak = 0.1;
        int kuantitas =  2;        
        
        // Declare and assign a calculated totalPrice
        double totalPrice;
        totalPrice = (kuantitas * harga) + pajak;
        
        // Modify message to include quantity 
        message = custName + " wants to purchase a " + kuantitas + itemDesc;
        System.out.println(message);
        
        // Print another message with the total cost
         message = "Total cost with tax is:" + totalPrice;
         System.out.println(message);
        
    }    
}


