package org.example.interviewCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveRepeatedDigitsFromLongNum {


    public static void main(String[] args) {

        int [] arry = new int[]{1,2,3,2,2,4,4,4,6,2,2,3,5,5};

        long num = 1221266884;

        System.out.println("Remove repeated digit from given 1221266884 :: "+ removeRecur(num));
    }


    static long removeRecur(long n){
        long prev_digit = n% 10;
        long pow =10;
        long res = prev_digit;


        while (n>0){
            long curr_digit = n% 10;
            if(curr_digit != prev_digit){
                res +=curr_digit * pow ;
            prev_digit = curr_digit;
            pow *=10;
            }
            n = n/ 10;
        }
        return res;
    }
}
