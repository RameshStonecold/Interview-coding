package org.example.StringPrograms;

public class ReplaceACharAtSpecificIndex {
    public static void main(String[] args) {

        // Get the String
        String str = "Geeks Gor Geeks";
        int index = 6;
        char ch = 'F';

        usingJavaString(str,index,ch);

        usingStringBuilder(str,index,ch);

    }

    public static void usingJavaString(String str, int index, char ch ){
        // Get the String
        System.out.println("Original String = " + str);
        str = str.substring(0, index) + ch + str.substring(index + 1);
        System.out.println("Modified String = " + str);
    }



    public static void usingStringBuilder(String str, int index, char ch ){
        System.out.println("=========Using StringBuilder============");
        System.out.println("Before str "+str);
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(index,ch);
        System.out.println("After Str"+ sb);
    }
}
