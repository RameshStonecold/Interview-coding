package org.example.StringPrograms;

import java.util.HashMap;

public class CountNoOfOccuranceInString {



    public static void main(String[] args) {


        String str = "112233abcabc";
      //  HashMap<Character,Integer> usingHashmap =countOccuranceUsingHashmap("Using Hashmap :: "+str);
     //   System.out.println("Using hashmap :: "+usingHashmap);
       // System.out.println("------------------------");
     //   String withoutUsingHashmap = countOccuranceWithoutHashmap(str);
   //     System.out.println("Without using hashmap :: "+withoutUsingHashmap);

        System.out.println("--------------1----------");


          repeatedOccurranceOfString(str);
        System.out.println("--------------1----------");
        usingHashMapAnotherway(str);
    }



    private static HashMap<Character, Integer> countOccuranceUsingHashmap(String str){

     //HashMap char as a key and occurrence as a value
        HashMap <Character, Integer> map = new HashMap<>();
        for (int i = str.length() - 1; i >= 0; i--)
        {
            if(map.containsKey(str.charAt(i)))
            {
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), ++count);
            }
            else
            {
                map.put(str.charAt(i),1);
            }
        }
        return map;
    }

    private static String countOccuranceWithoutHashmap(String str) {

        StringBuilder sb = new StringBuilder();
        int i, len;
        int[] counter = new int[256];
        len = str.length();
      // loop through the string and count frequency of every character and store it in counter array
        for (i = 0; i < len; i++)
        {
            counter[(int) str.charAt(i)]++;
        }
      //print Frequency of characters
        for (i = 0; i < 256; i++)
        {
            if (counter[i] != 0)
            {
      // prints frequency of characters
                System.out.println((char) i + " --> " + counter[i]);
            }
        }
        return sb.toString();
    }

    private static void repeatedOccurranceOfString(String str){

        char ch[] =str.toCharArray();


        for (int i=0; i<ch.length; i++){

            int count =0;
            char char1 =0;
            for (int j=1 ; j<ch.length; j++){

                if(ch[i]==ch[j]){
                    count++;
                    char1=ch[i];
                    System.out.println(char1 +"-->"+count);
                }
            }
        }

    }

    private static void usingHashMapAnotherway(String str){

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++){

            if(map.containsKey(str.charAt(i))) {
                int count = map.get(str.charAt(i));
                map.put(str.charAt(i), count + 1);
            }else {
                map.put(str.charAt(i),1);
            }
        }

        System.out.println(" Using hashmap another way"+map);

    }


}

