package org.example.StringPrograms;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SwapPairOfCharactersInString {

    public static void main(String[] args) {
        String str = "GeeksForGeeks";
        swapPairOfChars(str);
        System.out.println("-----------");

        usingJava8(str);
    }

    public static void swapPairOfChars(String str){

            String result= "";
            String temp = "";

            int count =1;

            for( int i=0; i<str.length(); i++) {

                if(count%2==0){
                    result = result+str.charAt(i)+temp;
                    temp = "";
                }else {
                    temp = String.valueOf(str.charAt(i));
                }
                count++;
            }

            System.out.println(result);
        }


        private static void usingJava8(String str){

         String result = IntStream.of(0,str.length()).
                 mapToObj(i-> {
                     if((i%2==0) && i!= str.length()-1){
                         return str.charAt(i+1)+""+str.charAt(i);
                     } else if (i==str.length()-1) {
                         return String.valueOf(str.charAt(i));
                     }else {
                         return "";
                     }
                 }).collect(Collectors.joining());
         System.out.println("Using java8 :" +result);

        }

}
