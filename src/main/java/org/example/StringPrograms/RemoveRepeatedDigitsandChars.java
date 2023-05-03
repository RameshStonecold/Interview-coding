package org.example.StringPrograms;

import java.util.Arrays;

public class RemoveRepeatedDigitsandChars {

    public static void main(String[] args) {

        String str ="abcdabcdefde2312345123";
        removeRepeatedChar(str);
    }


    private static void removeRepeatedChar(String str){
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        if(!str.isEmpty()) {

            Arrays.sort(chars);

            sb.append(chars[0]);
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] != chars[i -1]) {
                    sb.append(chars[i]);
                }
            }
        }
        System.out.println( " Non repeated char "+ sb.toString());
    }
}

