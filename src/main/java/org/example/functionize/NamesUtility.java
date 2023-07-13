package org.example.functionize;

import java.util.*;

public final class NamesUtility {


    private NamesUtility() {
        // Prevent instantiation of the class
    }

    public static List<Set<String>> generateNameSets(List<String> names, int numSets) {
        List<Set<String>> result = new ArrayList<>();

        if (names.size() < numSets) {
            throw new IllegalArgumentException("List must contain at least 3 names");
        }

        Random rand = new Random();

        for (int i = 0; i < numSets; i++) {
            Set<String> set = new HashSet<>();

            while (set.size() < 3) {
                set.add(names.get(rand.nextInt(names.size())));
            }

            result.add(set);
        }

        return result;
    }

    public static void displayNameSets(List<Set<String>> nameSets) {
        for (Set<String> set : nameSets) {
            System.out.println(String.join(",", set));
        }
    }


}
