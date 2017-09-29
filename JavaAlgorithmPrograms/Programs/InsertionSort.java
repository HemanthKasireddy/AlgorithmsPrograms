package com.bridgeit.JavaAlgorithmPrograms.Programs;

import com.bridgeit.JavaAlgorithmPrograms.Utility.Utility;

public class InsertionSort {
	
	public static void main(String[] args) {

		String []unSortedArray={"hemanth","sunny","kasireddy","reddy","Mr.","Hi"};
		String[] sortedArray=Utility.insertionSort(unSortedArray);
		System.out.print("The sorted array is: ");
		for(String i:sortedArray)
			System.out.print(i+"  ");
	}
}
