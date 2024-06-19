package org.example.interviewCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveRepeatedDigitsFromLongNum {


    public static void main(String[] args) {

        int [] arry = new int[]{1,2,3,2,2,4,4,4,6,2,2,3,5,5};

        long num = 1221266884;

        System.out.println("Remove repeated digit from given 1221266884 :: "+ removeRecur(num));

        System.out.println(removeRepeatedLongDigits(num));

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

    static long removeRepeatedLongDigits(long n)
    {

        // Store first digits as previous
        // digit
        long prev_digit = n % 10;

        // Initialize power
        long pow = 10;
        long res = prev_digit;

        // Iterate through all digits of n,
        // note that the digits are
        // processed from least significant
        // digit to most significant digit.
        while (n>0) {

            // Store current digit
            long curr_digit = n % 10;

            if (curr_digit != prev_digit)
            {
                // Add the current digit to
                // the beginning of result
                res += curr_digit * pow;

                // Update previous result
                // and power
                prev_digit = curr_digit;
                pow *= 10;
            }

            // Remove last digit from n
            n = n / 10;
        }

        return res;
    }
}
