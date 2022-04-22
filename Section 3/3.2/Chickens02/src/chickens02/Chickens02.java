
package chickens02;

public class Chickens02 {
    public static void main(String[] args) {
    int senin  = 100;
    int selasa = 121;
    int rabu   = 117;
    float dailyAverage, monthlyAverage, monthlyProfit;
    
    dailyAverage = (float)(senin+selasa+rabu)/3;
    monthlyAverage = dailyAverage * 30;
    monthlyProfit = (float) (monthlyAverage * 0.18);
    
    
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}