package org.example.java8.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {


        // Creating a HashMap
        Map<String, String> foodTable
                = new HashMap<String, String>();

        // Inserting elements to the adobe HashMap
        // Elements- Key value pairs using put() method
        foodTable.put("A", "Angular");
        foodTable.put("J", "Java");
        foodTable.put("P", "Python");
        foodTable.put("H", "Hibernate");

        // Iterating HashMap through for loop
        for (Map.Entry<String, String> set :
                foodTable.entrySet()) {

            // Printing all elements of a Map
            System.out.println(set.getKey() + " = "
                    + set.getValue());
        }

        usingIterator();
        usingLamdaExpression();
    }

    private static void usingIterator(){

        Map<String,Integer> map = new HashMap<>();

        map.put("Hi",1);
        map.put("Hello",2);
        map.put("Hi",3);
        map.put("Hi",4);

        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){

            System.out.println("Using Iterator : "+iterator.next());
        }

    }

    private static void usingLamdaExpression(){
        Map<String,Integer> map = new HashMap<>();
        map.put("Hello",1);
        map.put("Hi",2);
        map.put("Hi",3);
        map.put("N",3);

        map.forEach( (k,v) -> System.out.println(" Using Lamda Expression :" +k+v));

    }


}
