package org.example.StringPrograms;


import java.util.*;

public class SortTheCharacterFrequencyInAsc {
    public static void main(String[] args) {

        String str = "aaaaaammdddddkkkx";
        sortChar(str);
        System.out.println("-------------");
        usingAnotherMethod(str);
    }

  private static void sortChar(String str){

        char [] ch = str.toCharArray();

      HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0; i<ch.length; i++){

            if(map.containsKey(ch[i])){
                int count = map.get(ch[i]);
             map.put(ch[i],count+1);
            }else {
                map.put(ch[i],1);
            }

        }




  }




  private static void usingAnotherMethod(String str){

     // Scanner scanner = new Scanner(System.in);
     // System.out.print("Enter the text =  ");
   //   String str = scanner.nextLine();
      Map<Character, Integer> map = new HashMap<>();
      for (char c : str.toCharArray()) {
          map.put(c, map.getOrDefault(c, 0) + 1);
      }

      List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
      list.sort(Comparator.comparing(Map.Entry::getValue));

      StringBuilder strSb = new StringBuilder();
      for (Map.Entry<Character, Integer> entry : list) {
          char ch = entry.getKey();
          int fr = entry.getValue();
          for (int i = 0; i < fr; i++) {
              strSb.append(ch);
          }
      }
      System.out.println("Given Text : " + str);
      System.out.println("Sorted result: " + strSb.toString());

    }


}
