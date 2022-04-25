
package section.pkg4.pkg4;
import java.util.Random;
import java.util.Scanner;

public class Section44 {


    public static void main(String[] args) {
//        Random rndNum = new Random();
//        int randomNum = rndNum.nextInt();
//        System.out.println("Random Number: " + randomNum);
//        
//    }
//    
//}

//        Scanner numberScanner = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userNum = numberScanner.nextInt();
//        Random rnd = new Random();
//        int winningNum = rnd.nextInt(10) + 1;
//        String userNumber = null;
//        System.out.println("Your Number: " + userNumber);
//        System.out.println("The winning number is: " + winningNum);
//}
//}

        Random rand = new Random(20L);
        System.out.println("Random Number 1: " + rand.nextInt(100));
        System.out.println("Random Number 2: " + rand.nextInt(100));
        System.out.println("Random Number 3: " + rand.nextInt(100));
        System.out.println("Changing seed to change to sequence");
        rand.setSeed(5L);
        System.out.println("Random Number 4: " + rand.nextInt(100));
        System.out.println("Random Number 5: " + rand.nextInt(100));
        System.out.println("Nomor Acak 6: " + rand.nextInt(100));
        System.out.println("Setting seed 20 produce previous sequence");
        rand.setSeed(20L);
        System.out.println("Random Number 7: " + rand.nextInt(100));
        System.out.println("Random Number 8: " + rand.nextInt(100));
        System.out.println("Random Number 9: " + rand.nextInt(100));
}
}
