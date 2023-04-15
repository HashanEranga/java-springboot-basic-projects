package com.hashan.javspringbasics.dependencyinjection.Sorting;

import org.springframework.stereotype.Component;

@Component
public interface SortAlgorithm {
    public int[] sort(int[] arr);
}
