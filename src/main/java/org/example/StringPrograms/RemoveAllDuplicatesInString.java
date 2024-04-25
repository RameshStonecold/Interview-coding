package org.example.StringPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveAllDuplicatesInString {

    public static void main(String[] args) {

        String str = "Ramesh Shakapurapu";
        removeAllDuplicates(str);
    }

    private static void removeAllDuplicates(String str){

        String res="";

        for(int i=0; i<str.length(); i++){

            char ch = str.charAt(i);

            char ch2 = Character.toLowerCase(ch);

            if(ch!=' '){
                if(res.indexOf(ch2)<=-1){
                    res= res+ch;
                }
            }

        }
        res = res.trim();
        System.out.println("Output : " + res);


    }
}
