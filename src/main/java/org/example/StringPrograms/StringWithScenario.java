package org.example.StringPrograms;

import java.util.HashMap;

public class StringWithScenario implements Cloneable{

    public static void main(String[] args) {
        String str = "ihgfed45cba";
       //o/p : abcdef45ghi


    }
    private static void getReverse(String str){
        char[] chrr =str.toCharArray();

        HashMap<String,Integer> map = new HashMap<>();
        char[] temp = new char[chrr.length];
        for (int i=chrr.length-1; i>0; i--){
            if(Character.isDigit(chrr[i])){

                map.put(String.valueOf(chrr[i]), Integer.valueOf(i));
            }else {
                temp[i]=chrr[i];
            }
        }
        map.get("");


    }

    @Override
    public StringWithScenario clone() {
        try {
            return (StringWithScenario) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
