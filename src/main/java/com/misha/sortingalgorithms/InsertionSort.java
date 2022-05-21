package com.misha.sortingalgorithms;

import java.util.ArrayList;

public class InsertionSort implements SortingAlgorithm{

    public void sort(ArrayList<Integer> numbers){
        for(int i = 1; i < numbers.size(); i++){
            int curValue = numbers.get(i);
            int j = i - 1;

            while (j >= 0 && curValue < numbers.get(j)){
                numbers.set(j + 1, numbers.get(j));
                j -= 1;
            }
            numbers.set(j + 1, curValue);

        }
    }
}
