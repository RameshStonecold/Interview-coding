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
      //  getCharFollowedNo(string);

        //System.out.println("-----------------");
       // patternImplement(string);
        //System.out.println("--------------------");
        //printGivenStringPattern(string);
        System.out.println("----------------");
        printPattern(string);

    }


    public static HashMap<Character, Integer> getCharFollowedNo(String finalStr) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < finalStr.length(); i++) {

            char ch = finalStr.charAt(i);

            if (Character.isAlphabetic(ch)) {
                map.put(ch, 0);
            } else if (Character.isDigit(ch)) {

            }


        }
        System.out.println(map);
        return map;

    }

    private static void patternImplement(String str) {

        char[] chArry = str.toCharArray();
        String orign = str;

        String result = "";

        for (int i = 0; i < chArry.length; i++) {
            if (Character.isAlphabetic(chArry[i])) {
                result += chArry[i];
            } else {
                result += printCharSeq(result.charAt(i-1), chArry[i]);
                result += chArry[i];
            }
        }

        printCommaSeq(orign, result );


    }


    private static String printCharSeq(char ch, char chr) {
        int n = chr-'0';
        String str = "";
        for (int i = 0; i < n - 1; i++) {
            str += ch;
        }
        return str;
    }

    private static String printComma(String str, int n){
        char charr[] = str.toCharArray();

        for(int i=str.length()-1; i>0; i++){

        }

        for (int i=0; i<n; i++){
            str+=",";
        }
        return str;
    }

    private static String printCommaSeq(String originalStr, String res) {

        String finalStr="";
        for (int i = originalStr.length() - 1; i > 0; i--) {
            if (Character.isDigit(originalStr.charAt(i))) {

                for (int j = 0; i < res.length(); j++) {

                    if (Character.isDigit(res.charAt(j))) {

                        finalStr+= originalStr.charAt(i)+ printCharSeq(res.charAt(j),originalStr.charAt(i));

                    }
                }

            }

        }

        return finalStr;
    }


    private static void printGivenStringPattern(String input){

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i += 2) {
            char letter = input.charAt(i);
            int count = Character.getNumericValue(input.charAt(i + 1));

            for (int j = 0; j < count; j++) {
                output.append(letter);
            }

            if (i < input.length() - 2) {
                output.append(",,");
            }
        }

        System.out.println("Given pattern, "+input+" :"+output);


    }

    private static void printPattern(String str){

        String org = str;
        String result ="";
        String temp = "";
        char[] arr = str.toCharArray();

        for (int i=0; i<arr.length; i++){

            if(Character.isDigit(arr[i])){

                int n = arr[i]-'0'; //which will converts char to int type

                for(int j=0; j<n-1; j++){
                    result+=temp;
                }
                repeateLoop(result,temp,n);

                temp="";
                for(int k =org.length()-1; i>0; i--){
                    char []chrry =org.toCharArray();

                    if(Character.isDigit(chrry[k])){
                        int num = chrry[i]-'0';
                        temp=",";
                        repeateLoop(result,temp,num);
                        temp="";
                    }
                }
            }else{
                result+=str.charAt(i);
                temp+=str.charAt(i);
            }
        }
           System.out.println("new pattern :"+result);

    }

    private static String repeateLoop(String result, String temp, int n){

        for(int j=0; j<n-1; j++){
            result+=temp;
        }
        return result;
    }



}
