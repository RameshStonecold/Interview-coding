package org.example.StringPrograms;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseStringInJava {

    public static void main(String[] args) {
        String str = "Hello world reverse";
        StringBuilder sb = new StringBuilder();

        StringBuilder sb2 = new StringBuilder();
        String str2 = "Welcome";

        char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
        for(int i= chars.length-1; i>=0; i--) {
            sb.append(chars[i]);
        }
        String blogName = "java2blog";
        String reverse = usingRecursion(blogName);
        System.out.println("Reverse of java2blog is:" + reverse);
        System.out.println("using forloop iteration :: "+sb.toString());
        System.out.println("Using reverse method :: "+ sb2.append(str2).reverse());

       System.out.println();
        usingJava8();
    }

    private static void usingForLoop(){
        String blogName = "java2blog";
        String reverse = "";
        for (int i = blogName.length() - 1; i >= 0; i--) {
            reverse = reverse + blogName.charAt(i);
        }
        System.out.println("Reverse of java2blog is: " + reverse);
    }

    private static String usingRecursion(String orig){
        if (orig.length() == 1)
            return orig;
        else
            return orig.charAt(orig.length() - 1) + usingRecursion(orig.substring(0, orig.length() - 1));
    }

    private static void usingJava8(){
        char[] charArray = "Aniruddh".toCharArray();
        IntStream.range(0, charArray.length)
                .mapToObj(i -> charArray[(charArray.length - 1) - i])
                .forEach(System.out::print);
    }


    private static void usingReverseMethodJava8(String str){


    }
}
