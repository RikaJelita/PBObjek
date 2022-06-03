package programkepegawaian;
import java.util.Scanner;

public class ProgramKepegawaian {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System. in );
        
        int jamKerja, gajiPokok, gol, insentif, totalInsentif, totalGaji;
        String namaPgw;
        
        System.out.print   ("Masukkan Nama Anda     : ");
        namaPgw = sn.nextLine();
        System.out.print   ("Masukkan Golongan (1-5): ");
        gol = sn.nextInt();
        System.out.print   ("Masukkan Jam Kerja     : ");
        jamKerja = sn.nextInt();
        
        
        switch(gol){
            case 1 : 
                gajiPokok= 10000000;
                break;
            case 2 :
                gajiPokok= 8000000;
                break;
            case 3 :
                gajiPokok= 5000000;
                break;
            case 4 :
                gajiPokok= 3000000;
                break;
            case 5 :
                gajiPokok= 2000000;
                break;   
            default :
                gajiPokok = 0;
            }
        
        if (jamKerja>200){
            insentif = 10000;	
        }else{
            insentif=0;
            }

        totalInsentif = jamKerja * insentif;
        totalGaji = totalInsentif + gajiPokok;        
        
        
        System.out.println ("Nama Anda      : "+namaPgw);
        System.out.println ("Gaji Pokok     : "+gajiPokok);
        System.out.println ("Insentif       : "+totalInsentif);
        System.out.println ("Total gaji     : "+totalGaji);
        
    } 
    
}
    



