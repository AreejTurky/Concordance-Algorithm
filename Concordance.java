/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication86;

/**
 *
 * @author raghadadel
 */
import java.util.*;

public class JavaApplication86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s="Hello new world Hello new world Hello new world";
        String n="new";
        int w=2;
        conc(s,n,w);
    }
    public static void conc(String s , String d , int w)
    {
        String x[]=s.split(" ");
        List<String> list= Arrays.asList(x);
        //Just to convert the string to list
        List<Integer> index= new ArrayList<>();
        List<String> conc= new ArrayList<>();
        int min=0, max=list.size()-1;
        
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(d))
                index.add(i);
        }
        for (int i = 0; i < index.size(); i++) {
            if(index.get(i) - w >= 0)
                min=index.get(i)- w;
            if(index.get(i) + w <= max)
                max=index.get(i) + w;
            for (int j = min; j <= max; j++) {
                conc.add(list.get(j));
            }
            max=list.size()-1;
        }
        
    }
}
