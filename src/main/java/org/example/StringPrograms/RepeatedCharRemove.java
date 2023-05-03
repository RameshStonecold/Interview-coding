package org.example.StringPrograms;

import java.util.HashMap;

public class RepeatedCharRemove {


    public static void main(String[] args) {

        String str ="ababbacca12312345643";
        removeRepeat(str);

    }



    private static void removeRepeat(String str){

        char[] chrs = str.toCharArray();


        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0; i<chrs.length; i++){
            if (map.containsKey(chrs[i])){
                map.put(chrs[i], map.get(chrs[i])+1);
            }else {
                map.put(chrs[i],1);
            }
        }
        System.out.println( map);

    }
}
