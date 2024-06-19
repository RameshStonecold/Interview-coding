package org.example.StringPrograms;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterFromInputString {

    public static void main(String[] args) {
        String str = "abcaabcdedxy";
        firstNonRepeated(str);
         System.out.println("-------------------");
        firstNonRepeatJava8(str);
    }


    private static void firstNonRepeated(String str){

        char ch [] =str.toCharArray();

        int count =0;
        for (int i=0; i<ch.length; i++){

            for (int j=i; j<ch.length; j++){
                if(ch[i]==ch[j]) {
                    count++;
                }
            }
            if(count>1){
                count=0;
            }else {
                System.out.print(ch[i]);
            }
        }


    }

    private static void firstNonRepeatJava8(String str){
        List<Map.Entry<Character,Long>> st =str.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(x->x.getValue()==1L).skip(1).collect(Collectors.toList());

        System.out.println("Using java8 collectors :"+st);


       char ch = str.chars().mapToObj(x->(char)x).distinct().findFirst().get();

        System.out.println("Using java8 : "+ch);
    }

    private static void secondNonRepeatedChar(){

    }

}
