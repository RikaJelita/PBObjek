
package com.example;

import java.util.ArrayList;

public class ArrayListOperations {

    public static void main(String[] args) {
        ArrayList<String> currency = new ArrayList<String>();
        currency.add("Dollar");
        currency.add("Pound");
        currency.add("Euro");
        currency.add("Peso");
        currency.add("Dhiram");
        currency.add(3, "Rupee");
        if (currency.contains("Rupee")) {
            System.out.println(" Currency is present");
        } else {
            System.out.println(" Currency is not present");
        }
        currency.remove("Rupee");
        System.out.println("The following currency are present");
      for(String i:currency)  
      {
          System.out.println(i);
      }
    }

}
