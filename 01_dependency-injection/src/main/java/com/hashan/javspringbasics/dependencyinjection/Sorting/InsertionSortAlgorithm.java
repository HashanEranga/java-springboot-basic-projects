package com.hashan.javspringbasics.dependencyinjection.Sorting;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class InsertionSortAlgorithm implements SortAlgorithm{
    public int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            int j = i;
            while(elem < arr[j] && j > 0){
                arr[j-1] = arr[j];
                j--;
            }
            arr[j] = elem;
        }

        return arr;
    }
}
