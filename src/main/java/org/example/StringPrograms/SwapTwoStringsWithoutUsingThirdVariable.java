package org.example.StringPrograms;

public class SwapTwoStringsWithoutUsingThirdVariable {

    public static void main(String[] args) {

        String s1 = "Hi";
        String s2 = "Hello";

        System.out.println("Before swap s1: "+s1+", s2 :"+s2);

        swap(s1,s2);

    }

    private static void swap(String s1, String s2){
        s1 = s1.concat(s2);

       s2 = s1.substring(0,s1.length()-s2.length());
       s1= s1.substring(s2.length());

        System.out.println("After Swap, s1 :"+s1+", s2: "+s2);
    }
}
