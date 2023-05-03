package org.example.StringPrograms;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class RemoveAllWhiteSpacesInString {




    public static void main(String[] args) {

        String inputString = " 4333 shudn 8933 243";
        String stringWithoutSpaces = inputString.replaceAll("\\s+", "");
        System.out.println("Input String : "+inputString);
        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
        System.out.println("-------------------------------");

        System.out.println("Second method ::"+ withoutReplaceAllMethod(inputString));
    }


    public static String withoutReplaceAllMethod(String str) {
        char ch[] = str.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            if ((ch[i] != ' ') && (ch[i] != '\t')) {
                sb.append(ch);
            }else {

            }
        }
        return sb.toString();
    }

    private static void usingJava8(String str){


    }

}
