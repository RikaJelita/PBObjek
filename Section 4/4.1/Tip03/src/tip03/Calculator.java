
package tip03;

public class Calculator {
    public double tax = 0.05;
    public double tip = 0.15;
    int originalPrice;
    
    public void findTotal(double price){
        double total = price*(1+tax+tip);
        System.out.println("$" +total);

    }

    void findTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
