package org.example.StringPrograms;

import org.example.java8.model.Employee;

import java.util.*;

public class StringToImplementPattern {
    public static void main(String[] args) {
        /*
             Input - x3y2w5t4
             Output - xxx,,,,yy,,,,,wwwww,,tttt,,,
        * */
        String string = "x3y2w5t4";

       // Input - x3y2w5t4
       //  [x,3], [y,2], [w,5], [t,4]
       //
        getCharFollowedNo(string);
    }



    public static HashMap<Character,Integer> getCharFollowedNo(String finalStr){

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<finalStr.length(); i++){

            char ch = finalStr.charAt(i);

            if(Character.isAlphabetic(ch)){
                map.put(ch,0);
            } else if (Character.isDigit(ch)) {

            }


        }
        System.out.println(map);
        return map;

    }



}
