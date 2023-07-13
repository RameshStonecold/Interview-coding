package org.example.functionize;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class NamesClient {

    public static void main(String[] args) {
        try(FileReader reader = new FileReader("C://Users//rames//Downloads//namesTest.txt");
            BufferedReader bufferedReader = new BufferedReader(reader)){

            Map<String,Long> map = new LinkedHashMap<>();

            List<String> nameList = new ArrayList<>();
            String str ="";
            int count =1;
            while ((str = bufferedReader.readLine()) != null) {

                map.put(str, (long) count);
                count++;
                nameList.add(str);

            }
            List<Set<String>> nameSets = NamesUtility.generateNameSets(nameList, 3);
            NamesUtility.displayNameSets(nameSets);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
