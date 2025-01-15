package org.example.java8.summarystatics;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SummaryStatisticsDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        statistics(numbers);

    }


    private static void statistics(List<Integer> numbers){

        IntSummaryStatistics stats = numbers.stream().mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Statistics of given array : "+stats);

    }
}
