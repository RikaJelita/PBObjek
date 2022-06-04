
package com.example;
import java.util.ArrayList;
 
public class ArrayListEx1 {          
   
    public static void main(String[] args) {
    
    ArrayList<String> name = new ArrayList<>();
    name.add("Amy");
    name.add("Bob");
    name.add("Cindy");
    name.add("David");

    System.out.println(name);
    System.out.println(name.size());
    
    name.add(0,"Nick");
    name.add(1,"Mike");
    name.remove(3);
    name.remove(name.size() - 1);
    

    System.out.println(name);
    System.out.println(name.size());
        
    }
    
}

