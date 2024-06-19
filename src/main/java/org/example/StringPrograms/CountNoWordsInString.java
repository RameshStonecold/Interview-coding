package org.example.StringPrograms;

import java.util.Arrays;
import java.util.HashMap;


public class CountNoWordsInString {

    public static void main(String[] args) {
        String str = "This this is the first test this is done by the interview practises is by";

      String[] strArry =  str.split(" ");

      System.out.println(" Using split method count :: "+Arrays.stream(strArry).count());

      System.out.println("------------------ ");
      System.out.println("Using hashmap : " +getStringCount(str));

    }

    public static HashMap<String,Integer> getStringCount(String str){

        HashMap<String,Integer> map = new HashMap<>();
       String[] stringArray = str.split(" ");

        for (int i=0; i<stringArray.length; i++) {
            if (map.containsKey(stringArray[i])) {
                int count = map.get(stringArray[i]);
                map.put(stringArray[i], count+1);
            }
            else {
                map.put(stringArray[i], 1);
            }
        }
        return map;
    }
}
