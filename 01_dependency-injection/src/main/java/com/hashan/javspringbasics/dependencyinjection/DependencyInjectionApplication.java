package com.hashan.javspringbasics.dependencyinjection;

import com.hashan.javspringbasics.dependencyinjection.Sorting.SortAlgorithm;
import com.hashan.javspringbasics.dependencyinjection.searching.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		// creating an application context that handles the beans
		ApplicationContext applicationContext = SpringApplication.run(DependencyInjectionApplication.class, args);
		SortAlgorithm sortAlgorithm = applicationContext.getBean(SortAlgorithm.class);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		boolean answer = binarySearch.binarySearch(new int[]{5,4,3,2,1,}, 4);
		boolean answer2 = binarySearch.binarySearch(new int[]{5,4,3,2,1,}, 6);

		int[] result =sortAlgorithm.sort(new int[]{5,4,3,2,1});
		printArray(result);
		System.out.println(answer);
		System.out.println(answer2);

	}

	public static void printArray(int[] arr){
		for (int j : arr) {
			System.out.print(j + ", ");
		}
	}

}
