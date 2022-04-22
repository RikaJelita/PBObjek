
package chickens01;

public class Chickens01 {
    public static void main(String[] args) {
      int eggsPerChicken;
      int chickenCount;
      int totalEggs;
      
    //Skenario 1
      //Senin
      eggsPerChicken = 5;
      chickenCount   = 3;
      totalEggs = eggsPerChicken * chickenCount;
                
      //Selasa dapat 1 ayam
      chickenCount = chickenCount +1; //sekarang ayamnya 4
      totalEggs = totalEggs + (eggsPerChicken * chickenCount);
      
      //Rabu ayam hilang setengahnya
      chickenCount = chickenCount / 2;
      totalEggs = totalEggs + (eggsPerChicken * chickenCount); 
      System.out.println(totalEggs);
                
    //Skenario 2
      //Senin
      eggsPerChicken = 4;
      chickenCount   = 8;
      totalEggs = eggsPerChicken * chickenCount;
               
      //Selasa dapat 1 ayam
      chickenCount = chickenCount +1; //sekarang ayamnya 5
      totalEggs = totalEggs + (eggsPerChicken * chickenCount);
      
      //Rabu ayam hilang setengahnya
        chickenCount = chickenCount / 2;
        totalEggs = totalEggs + (eggsPerChicken * chickenCount); 
        System.out.println(totalEggs);
          
    }   
}        
     