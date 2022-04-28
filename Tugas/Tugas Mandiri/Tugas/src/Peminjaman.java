package tugas;
import java.util.Scanner;
        
public class Peminjaman {
    public static void main (String [] args){
        Scanner a = new Scanner(System. in );
        int nim, hargaSewa,kode;
        String namaMhs;
     
        System.out.println ("===========================================================");
        System.out.println ("INPUT DATA PEMINJAM");
        System.out.println ("===========================================================");
        System.out.print   ("Masukkan Nama       = ");
        namaMhs = a.nextLine();
        System.out.print   ("Masukkan Nim        = ");
        nim = a.nextInt();
        System.out.print   ("Masukkan Kode Buku  = ");
        kode = a.nextInt();
        System.out.println ("==========================================================");
        
        hargaSewa = 5000;   
      
        System.out.println("");
        System.out.println ("==========================================================");
        System.out.println ("DATA PEMINJAM");
        System.out.println ("==========================================================");
        System.out.println ("Nama Mahasiswa               = "+namaMhs);
        System.out.println ("Nim Mahasiswa                = "+nim);
        System.out.println ("Kode Buku                    = "+kode);
        System.out.println ("Total Biaya Pinjam           = "+hargaSewa);
        System.out.println ("=========================================================="); 
    }
}

