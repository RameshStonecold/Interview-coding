package org.example.StringPrograms;

public class LeftShiftDigitInString {

    public static void main(String[] args) {

        String str = "JavaWorld";
        int num =2;
       String rightShift= shiftRightCharsBynDigit(str,num);
        System.out.println("Right Shift by "+num+" digit and given string '"+str+"' :: "+rightShift);
        String leftShift = shiftLeftCharsByNDigit(str,num);
        System.out.println("---------------------");
        System.out.println("Left Shift by "+num+" digit and given string '"+str+"' :: "+leftShift);

    }


    public static String shiftRightCharsBynDigit(String s , int times) {
        String temp = s;
        for (int i = 0; i < times ; i++) {

            temp =  temp.charAt(temp.length()-1)+temp.substring(0, temp.length()-1);
        }
        return temp;
    }


    public static String shiftLeftCharsByNDigit(String s, int n){
        String temp = s;

        for (int i=0; i< n ; i++){
            temp =  temp.substring(1, temp.length())+temp.charAt(0);
        }
        return temp;
    }

}
