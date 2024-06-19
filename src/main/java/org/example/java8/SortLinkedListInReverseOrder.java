package org.example.java8;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Stream;

public class SortLinkedListInReverseOrder {


    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        Iterator<String> li = linkedList.descendingIterator();

        while (li.hasNext()){
            System.out.println(li.next());
        }


    }
}
