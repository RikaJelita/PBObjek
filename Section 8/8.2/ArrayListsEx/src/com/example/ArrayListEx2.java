
package com.example;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Integer> num = new ArrayList<>();

        num.add(22);
        num.add(31);
        num.add(37);
        num.add(40);
        num.add(55);
        num.add(60);

        Iterator<Integer> iter = num.iterator();
        while (iter.hasNext()){
        System.out.println(iter.next());}
        
        for(int i = 0;i<num.size();i++){
        int a;
        a = num.get(i);
        if(a % 2 == 0){
        num.remove(i);}
        }        
        System.out.println(num);    
              
    }
}
