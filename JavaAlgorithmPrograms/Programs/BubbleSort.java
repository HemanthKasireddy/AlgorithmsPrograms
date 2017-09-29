package com.bridgeit.JavaAlgorithmPrograms.Programs;

import com.bridgeit.JavaAlgorithmPrograms.Utility.Utility;

public class BubbleSort {
	
	public static void main(String [] args){
		Integer []userArray={10,2,1,6,9,12,4,7,5,11,8};
		Integer[] sortedArray=Utility.bubbleSort(userArray);
		System.out.print("The Sorted array is:  ");
		for(int i:sortedArray) {
			System.out.print(i+"  ");
		}
	}
}
