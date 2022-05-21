package com.misha.sortingalgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlgoUtils {

    private AlgoUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static void timeAlgorithms(List<SortingAlgorithm> algos){
        for(SortingAlgorithm algo : algos){
            ArrayList<Integer> numbers = fillRandom(10_000);
            ArrayList<Integer> nums2 = new ArrayList<>(numbers);
            long time = System.currentTimeMillis();
            algo.sort(numbers);
            time = System.currentTimeMillis() - time;
            System.out.println(algo.getClass().getSimpleName() + " finished sorting in " + time);
            nums2.sort(null);
            System.out.println("Sorting Correctness " + numbers.equals(nums2));

        }

    }
    public static ArrayList<Integer> fillRandom(int size){
        return ThreadLocalRandom.current().ints(size)
                .parallel()
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<Integer> fillSorted(boolean ascending, int size) {
        ArrayList<Integer> sequence = IntStream.range(0, size)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        if (!ascending) Collections.reverse(sequence);
        return sequence;
    }

}
