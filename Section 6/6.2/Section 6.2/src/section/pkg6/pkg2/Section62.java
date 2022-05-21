package section.pkg6.pkg2;
import java.util.Scanner;

public class Section62 {

//LOOP WHILE
    public static void main(String[] args) {
//        int i = 10;
//        System.out.println("Countdown to Launch!");
//        while (i >= 0) {
//            System.out.println(i);
//            i--;
//           }        
//        System.out.println("Blast Off!");
//}
//}

    
 //LOOP DO-WHILE 
//        int i = 10;
//    System.out.println("Countdown to Launch!");
//    do {
//       System.out.println(i);
//       i--;
//    }while (i >= 0);
//     System.out.println("Blast Off!");
//}
//}

    

    int jum, data, tot=0;
    Scanner masuk = new Scanner(System.in);
    System.out.print ("jumlah data? : ");
    jum = masuk.nextInt();
    for (int i =1; i<=jum; i++){
    System.out.print("Masukkan data: ");
    data = masuk.nextInt();
    tot += data;
    }
    System.out.print("total: " +tot);
 
}
}
 