package com.misha.sortingalgorithms;

import java.util.ArrayList;

public class SortingAlgorithmDemo {

    public static void main(String[] args) {
        ArrayList<SortingAlgorithm> algos = new ArrayList<>();
        algos.add(new InsertionSort());

        AlgoUtils.timeAlgorithms(algos);
    }
}
