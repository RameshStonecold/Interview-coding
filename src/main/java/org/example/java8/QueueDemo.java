package org.example.java8;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<String> q = new PriorityQueue<>();

        q.add("Hi");
        q.add("Hello");
        q.add("world");
        q.offer("hi");

        q.stream().forEach(System.out::println);


        System.out.println(q.peek());

        System.out.println(q.poll());



        System.out.println( q.size());
        System.out.println( "---------------------------------------");
        checkHashSetDuplicateElimentsSize();

    }


    private static void checkHashSetDuplicateElimentsSize(){

        HashSet<String> set = new HashSet<>();

        set.add("Hi");
        set.add("Hello");
        set.add("World");



        set.forEach(System.out::println);
        set.add("no");
        System.out.println(set.size());

        System.out.println(set.contains("Hi"));
        set.removeIf(x->x.matches("Hi"));
        System.out.println("-----------");
        set.forEach(System.out::println);


    }
}
