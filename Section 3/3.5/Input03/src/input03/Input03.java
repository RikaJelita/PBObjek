package input03;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner scan = new Scanner(System.in);
                
        //Find and print the sum of three integers entered by the user
        System.out.print("Masukkan bilangan 1: ");
        int a = scan.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        int b = scan.nextInt();
        System.out.print("masukkan bilangan 3: ");
        int c = scan.nextInt();
        
        int sum = a+b+c;
        System.out.println("Jumlah: "+sum);
        
        //Remember to close the Scanner
        scan.close();
       }
}

