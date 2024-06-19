package org.example.interviewCoding;

public class ArmstrongNumber {

    public static void main(String[] args) {

        //int num =371;
        int num =431;


        armstrongNum(num);
    }

    private static void armstrongNum(int num){

        int originalNumber, remainder, result = 0;

        originalNumber = num;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;

          //  System.out.println(" result += Math.pow(remainder, 3); "+remainder+", "+Math.pow(remainder, 3));
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");

    }

}
