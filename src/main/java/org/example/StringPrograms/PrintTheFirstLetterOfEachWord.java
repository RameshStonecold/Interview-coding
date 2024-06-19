package org.example.StringPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintTheFirstLetterOfEachWord {
    public static void main(String[] args) {

        String str = "Geeks for Geeks";
        matchingFirstLetterInWord(str);


    }


    private static void matchingFirstLetterInWord(String str){

        String [] strA =str.split("");


        Pattern p = Pattern.compile("\\b[a-zA-Z]");


        Matcher m1 = p.matcher(str);

        System.out.println(m1.find());
        System.out.println(m1.group());


    }
}
