package com.bridgeit.JavaAlgorithmPrograms.Programs;

import com.bridgeit.JavaAlgorithmPrograms.Utility.Utility;

public class MergeSort {


public static void main(String[] args){
	String [] unSortedStringArray={"hemanth","sunny","kasireddy","Hi","reddy","Mr."};
    int low=0;
    int high=unSortedStringArray.length-1;
    if (high==1||high==0)
    	System.out.println("Array is already in sorted order");
    else
    {
    	Utility.sortStrings(unSortedStringArray,low,high);
        System.out.println("Sorted arry is : ");
    	for(String str:unSortedStringArray)
         	System.out.println(str);
    }
    
}
}
