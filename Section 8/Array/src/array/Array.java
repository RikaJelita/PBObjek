
package array;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Array {

    public static void main(String[] args) {
        
//       int umur [] = new  int [4];
//       umur [2] = 10;
//       umur [0] = 25;
//       
//       int age[] = {12,16,23,40};
////       System.out.println ("age 2 : " + age [2]);
////       System.out.println(umur [2]);
////       System.out.println(umur [3]);
////       System.out.println(umur [0]);
//         System.out.println("Panjang array :"+age.length);
//
//       for (int a=0; a<age.length; a++){
//           System.out.println("isi data: "+ age[a]);
//       }
//    }
//    
//}


//    String nama []= new String [10]; 
//        
//    nama [3] = "lala";
//    nama [5] = "lili";
//    nama [7] = "Nana";
//    
//    System.out.println(nama [3]);
//    System.out.println (nama [5]);
//    System.out.println (nama [7]);
//       for (int a=0; a<nama.length; a++){
//       System.out.println("isi data: "+ nama[a]);
//       }
//       for(String u: nama){
//          System.out.println("umur:"+u);
//       }
//        
//        }
//}
//   

//    canner nil = new Scanner(System.in);
//    int skor [] = new int [10];
//    int jumlah = 0;
//    double rerata = 0.0;
//    
    for (int a=0; a<10; a++){
        System.out.print("Masukkan data: ");
        skor[a] = nil.nextInt ();
        jumlah = jumlah + skor[a];
    }
    for (int s : skor){
        System.out.println("Datanya: " +s);
    }
    rerata = jumlah /10;
    System.out.println("Rata-rata: " + rerata); 
    }
//    }



//     ArrayList<String> nm = new ArrayList<>();
//     nm.add ("yodi");
//     nm.add ("budi");
//     nm.add ("doni");
     
//     nm.remove(1);
//     nm.remove ("doni");
//     System.out.println("isi arl: " + nm);
//     
//     for (String i : nm){    //for-each
//     System.out.println(i);
//     }

//      Iterator<String> ite = nm.iterator();
//      while (ite.hasNext()){
//        System.out.println(ite.next());
//    }
      
//     ListIterator<String> litr = nm.listIterator();
//     System.out.println("Maju");
//     while (litr.hasNext()){
//         System.out.println(litr.next());
//     }
//     System.out.println("Mundur");
//     while (litr.hasPrevious()){
//         System.out.println(litr.previous());
//     }
//
//    }
//}

//      ArrayList<Integer> umur = new ArrayList<>();
//      umur.add (10);
//      umur.add (0,12);
//      umur.add (2,31);
//      umur.add (1,5);
//      
//      System.out.println(umur);
//      int tot=0;
//      for (int a : umur){
//          tot = tot +  a;
//          }
//      System.out.println("total: " +tot);
//    }
//}

      
    ArrayList<Integer> skor = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    int jumdata, total=0;
    double rerata;
        
    System.out.print("Ingin masukkan berapa data: ");
    jumdata = s.nextInt();
    for (int a-0; a<jumdata; a++){
        System.out.print("Masu")
    }
    
    
    int skor [] = new int [10];
    int jumlah = 0;
    double rerata = 0.0;
    
    for (int a=0; a<10; a++){
        System.out.print("Masukkan data: ");
        skor[a] = nil.nextInt ();
        jumlah = jumlah + skor[a];
    }
    for (int s : skor){
        System.out.println("Datanya: " +s);
    }
    rerata = jumlah /10;
    System.out.println("Rata-rata: " + rerata); 
    }
    }
        