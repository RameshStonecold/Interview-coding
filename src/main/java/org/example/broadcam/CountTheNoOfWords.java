package org.example.broadcam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheNoOfWords {

    public static void main(String[] args) {

        String s = "Welcome to java";

        usingJava8(s);
        System.out.println("-----------");
        withoutJava8orHashmap(s);
    }

    private static void usingJava8(String s){

        List<String> strList = Arrays.asList(s.split(" "));

        Map<String,Long>map = strList.stream().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(" Count the words :: " +map);



    }


    private static void withoutJava8orHashmap(String str){
        char[] chars =str.toCharArray();

        int counter[] = new int[256];

        for (int i=0; i<str.length(); i++){
            counter[(int) str.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++)
        {
            if (counter[i] != 0)
            {
                System.out.println((char) i + " --> " + counter[i]);
            }
        }


    }
}
