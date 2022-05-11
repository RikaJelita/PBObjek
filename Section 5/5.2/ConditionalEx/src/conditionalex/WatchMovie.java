
package conditionalex;

import java.util.Scanner;


public class WatchMovie {

    public static void main(String args[]) {
//        int price = 12;
//        int rating = 5;
//        if (price >= 12 && rating == 5) {
//        System.out.println("I’m interested in watching the movie."); 
//        } 
//        else {
//        System.out.println("I am not interested in watching the movie.");
//       }
//}
//}      

        Scanner sn = new Scanner (System.in);
        System.out.print("Enter the movie ticket price: \n");
        int price = sn.nextInt();
        System.out.print("Enter the movie rating: ");
        int rating = sn.nextInt();
        
        if (price >= 12 && rating == 5){
        System.out.println("I’m interested in watching the movie."); 
        } 
        else {
        System.out.println("I am not interested in watching the movie.");
       }
}
}
