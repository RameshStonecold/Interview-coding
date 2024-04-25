package org.example.StringPrograms;

public class SwapPairOfCharactersInString {

    public static void main(String[] args) {
        String str = "GeeksForGeeks";
        swapPairOfChars(str);
    }

    public static void swapPairOfChars(String str){

            String result= "";
            String temp = "";

            int count =1;

            for( int i=0; i<str.length(); i++) {

                if(count%2==0){
                    result = result+str.charAt(i)+temp;
                    temp = "";
                }else {
                    temp = String.valueOf(str.charAt(i));
                }
                count++;
            }

            System.out.println(result);
        }



}
