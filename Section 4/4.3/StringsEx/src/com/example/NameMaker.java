
package com.example;
import javax.swing.JOptionPane;

public class NameMaker {
    
    public static void main(String args[])
    {
       String namaDepan = JOptionPane.showInputDialog("Nama Depan Anda : ");
       String namaTengah = JOptionPane.showInputDialog("Nama Tengah Anda : ");
       String namaAkhir = JOptionPane.showInputDialog("Nama Terakhir Anda : ");

       String namaLengkap = namaDepan + " " + namaTengah + " " + namaAkhir;
       System.out.println("Nama Lengkap Anda: " + namaLengkap);
    }
    
}
      