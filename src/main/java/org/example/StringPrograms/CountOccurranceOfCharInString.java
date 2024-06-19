package org.example.StringPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOccurranceOfCharInString {

    public static void main(String[] args) {

        String str = "Madam";   // o/p : M:2, a:2 , d:1

        //using Hashmap
        usingHashMap(str);

        // using java8
       usingJava8(str);

        usingCounterArray(str);
    }


    private static void usingHashMap(String str){

        String lowStr =str.toLowerCase();

        HashMap<Character,Integer> map= new HashMap<>();

        for (int i=0; i<lowStr.length(); i++){

            if (map.containsKey(lowStr.charAt(i))){

                int count = map.get(str.charAt(i));

                map.put((lowStr.charAt(i)),++count);
            }else {
                map.put((lowStr.charAt(i)),1);
            }
        }
        System.out.println("Using Hashmap :: "+map);
    }


    private static void usingJava8(String str){

      Map<String,Long> map = Arrays.stream(str.split("")).
              map(String::toLowerCase).collect(Collectors.groupingBy(x->x, LinkedHashMap::new,Collectors.counting()));

        System.out.println("Using Jav8 groupingBy :: "+map);

    }

    private static void usingCounterArray(String str){

        int []counter = new int[256];

        for (int i=0; i<str.length(); i++){
            counter[(int) str.charAt(i)]++;
        }
        System.out.println("Counter array :: "+counter.toString());

        for (int i = 0; i < 256; i++)
        {
            if (counter[i] != 0)
            {
                System.out.println((char) i + " --> " + counter[i]);
            }
        }
    }


}
