package com.hashan.javspringbasics.dependencyinjection.searching;

import com.hashan.javspringbasics.dependencyinjection.Sorting.SortAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl{
    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm){
        this.sortAlgorithm = sortAlgorithm;
    }

    public boolean binarySearch(int[] arr, int key){
        arr = sortAlgorithm.sort(arr);
        int start, mid, end;
        start = 0;
        end = arr.length-1;
        while(start != end){
            mid = (start+end)/2;
            if(arr[mid] == key) return true;
            if(key < arr[mid]){
                end = mid-1;
            }
            else start = mid+1;
        }
        return false;
    }
}
