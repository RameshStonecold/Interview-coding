package org.example.StringPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseStringInJava {

    public static void main(String[] args) {
        String str = "Hello world reverse";
        usingJava8();
        usingStringBuilder(str);
        usingForLoop();
        usingRecursion(str);
        usingStack(str);
        usingJava8StringBuilder(str);
        reverseTheStringWithUsingInbuiltFuncion();
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

        String str = "Ramesh";

        String reverse = str.chars().mapToObj(i-> (str.length()-1)-i).collect(StringBuilder::new, StringBuilder::appendCodePoint,StringBuilder::append).toString();


}


    private static void usingStringBuilder(String str){
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        System.out.println("Reverse of java2blog is:" + str);
        System.out.println("using forloop iteration :: "+sb.toString());
        System.out.println("Using reverse method :: "+ sb2.append(str).reverse());

    }


    private static void usingStack(String str){
        char[] reverseString = new char[str.length()];
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        int i = 0;
        while (!stack.isEmpty()) { // popping element untill stack become empty
            reverseString[i++] = stack.pop(); // get the character from the top of the stack
        }

        System.out.println("Using stack pop() "+ Arrays.toString(reverseString));


    }

    private static void reverseTheStringWithUsingInbuiltFuncion(){

        String str2 = "Ramesh5hjy";
        char chars[] = str2.toCharArray();

        int left =0, right = str2.length()-1;
        while (left<right){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
        }
        System.out.println("Without using inbuilt function "+ Arrays.toString(chars));
    }

    private static void usingJava8StringBuilder(String str){

        String result = str.chars().mapToObj(x-> (char)x).collect(StringBuilder::new,StringBuilder::append,StringBuilder::append).reverse().toString();
        System.out.println("-------------------");
        System.out.println(" Using string builder and java8 :: "+result);
    }
}
