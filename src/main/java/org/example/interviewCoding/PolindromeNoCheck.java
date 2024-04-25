package org.example.interviewCoding;

public class PolindromeNoCheck {
    public static void main(String[] args) {
       int num = 3553;
        usingWileLoop(num);

    }


    private static void usingWileLoop(int num){
        int originalNum = num;
        int rev =0;
        int rem =0;

        while (num!=0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num =num/10;
        }

        if(originalNum==rev){
            System.out.println("Given num : "+originalNum+" is Polindrome");
        }else {
            System.out.println("Given num : "+originalNum+" is not Polindrome");
        }

    }
}
