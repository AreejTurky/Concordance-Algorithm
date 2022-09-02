package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class Co_occurrence {

    public ArrayList[] concordance(List<String> allword , String content , String ws)
    {
        ArrayList<Integer> index= new ArrayList<>();
        ArrayList<String> postConc= new ArrayList<>();
        ArrayList<String> preConc= new ArrayList<>();
        ArrayList[] all=new ArrayList[3];

        String pre,post;
        int min=0, max=allword.size()-1;
        int size=Integer. parseInt(ws);          //convert spinner item -> int

        for (int i = 0; i < allword.size(); i++) {   //get the index of the similar word
            if(allword.get(i).equals(content))
                index.add(i);
        }

        for (int i = 0; i < index.size(); i++) {
            pre=""; post="";                    //Re-initial the sentence
            if(index.get(i) - size >= 0)
                min=index.get(i)- size;
            if(index.get(i) + size <= max)
                max=index.get(i) + size;
            for (int j = min; j <= max; j++) {
                if(j < index.get(i))
                    pre+=allword.get(j)+" ";

                else if (j > index.get(i))
                    post+=allword.get(j)+" ";
            }
            preConc.add(pre);
            postConc.add(post);
            max=allword.size()-1;
        }
        all[0]=preConc;
        all[1]=postConc;
        all[2]=index;
        return all;
    }
}
