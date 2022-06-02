public class AccountTest {
  public static void main(String[] args) {
  public double balance;
  public double interestRate;
  public String name;
  
  public void displayCustomer (){
    System.out.println("Customer: " + name);
    System.out.println("Balance: " +balance);
    System.out.println("Rate: " + interestRate);
}
}    

        
//  public void earnInterest(){
//    if(monthsRemaining > 0){
//    balance += balance * rate / 12;
//    monthsRemaining--;
//    System.out.println("Balance: $" +balance);
//    System.out.println("Rate: " +rate);
//    System.out.println("Months Remaining: " 
//        + monthsRemaining);
//    }
//    else{
//    System.out.println("Bond Matured");
//    }
//    }
//    }


   //LATIHAN 3
// Tulis metode withdraw() untuk memeriksa rekening 
//yang …
//−Menerima argumen ganda untuk jumlah yang akan ditarik
//−Mencetak peringatan jika saldo terlalu rendah untuk 
//melakukan penarikan
//−Mencetak peringatan jika argumen penarikan negatif
//−Jika tidak ada peringatan, jumlah penarikan akan dikurangi 
//dari saldo. Cetak saldo baru


    //LATIHAN 4
//    public void setTermAndRate(int t){
//        if(t>=0 && t<12)
//        rate = 0.005;
//        else if(t>=12 && t<24)
//        rate = 0.010;
//        else if(t>=24 && t<36)
//        rate = 0.015;
//        else if(t>=36 && t<48)
//        rate = 0.020;
//        else if(t>=48 && t<=60)
//        rate = 0.025;
//        else{
//        System.out.println("Invalid Term");
//        t = 0;
//        }
//        term = t; 
//        monthsRemaining = t; 
//        }



