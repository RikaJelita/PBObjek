
package tugas.mandiri;
import java.util.Scanner;

public class TugasMandiri {


    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      int angka1;
      int angka2;
      int pill;
      int hasil = 0;
      
      System.out.println("Program Kalkulator Sederhana");
      System.out.println("1. Penjumlahan");
      System.out.println("2. Pengurangan");
      System.out.println("3. Pembagian");
      System.out.println("4. Perkalian");
      System.out.println("5. Sisa Bagi");
      System.out.println("-----------------------------");
      
      System.out.print("Masukan Angka Pertama: ");
      angka1 = input.nextInt();
      System.out.print("Masukan Angka Kedua: ");
      angka2 = input.nextInt();
      
           
      System.out.print("Masukan Pilihan Operasi (1-5) : ");
      pill = input.nextInt();
 
     switch (pill)
        {
            case 1 : hasil = angka1 + angka2; break;
            case 2 : hasil = angka1 - angka2; break;
            case 3 : hasil = angka1 / angka2; break;
            case 4 : hasil = angka1 * angka2; break;
            case 5 : hasil = angka1 % angka2; break;
            default : System.out.println("Anda Salah Memasukkan Angka");
        }
      System.out.println("Hasil: " + hasil);
           
    }
    
}
