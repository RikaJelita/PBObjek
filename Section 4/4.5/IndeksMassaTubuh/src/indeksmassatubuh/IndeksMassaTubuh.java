
package indeksmassatubuh;

import java.util.Scanner;

public class IndeksMassaTubuh {
 
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Berat badan Anda (kg): ");
        double bb = inputScanner.nextDouble();
        System.out.print("Tinggi badan Anda (cm): ");
        double tb = inputScanner.nextDouble();
        
        double imt = bb/Math.pow(tb/100, 2);
        System.out.println("Indeks Massa Tubuh (IMT) Anda = "+imt);
            
    }
    
}
