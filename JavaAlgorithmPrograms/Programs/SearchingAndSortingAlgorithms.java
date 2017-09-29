package com.bridgeit.JavaAlgorithmPrograms.Programs;

import java.util.Scanner;

import com.bridgeit.JavaAlgorithmPrograms.Utility.Utility;

public class SearchingAndSortingAlgorithms {
	
	public static long curretnTime()
	{
		long currentTime=System.currentTimeMillis();
		return currentTime;
	}
	
	public static void main(String[] args) {
		  String[] strArray=new String[2];
		  long [] intArray=new long[2];
		
		Scanner scanner=new Scanner(System.in);
		//inserted 100 elements in the array in reverse order
		
	    Integer []userIntegerArray=new Integer[1000];
	    for(int i=0,j=1000;i<userIntegerArray.length;i++,j--) {
	    	userIntegerArray[i]=j;
	    }
		//int []userIntegerArray={100,99,98,97,96,95,94,93,-3,92,91,91,-2,90,89,88,87,86,85,84,83,-100,-8,82,81,-1,80,79,78,77-7,76,75,74,7,0,3,72,71,-5,70,69,68,67,66,65,64,63,62,61,60,59,58,57,56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
		
	    
	    //******************Bubble sort for integers
	    System.out.println("******************Bubble sort for integers*******************************");
		long bubblesortStartTime = curretnTime();
		Integer[] bubbleSortedArray = Utility.bubbleSort(userIntegerArray);
		long bubblesortEndTime = curretnTime();
		long totalBubbleSortElapsedTime = bubblesortEndTime - bubblesortStartTime ;
		System.out.println("Total time for bubble sort: " +totalBubbleSortElapsedTime);
		
		strArray[0]="Bubble sort For integer";
		intArray[0]=totalBubbleSortElapsedTime;
		
		System.out.print("The sorted array is: ");
		for (int i:bubbleSortedArray) {
			System.out.print(i+"  ");
		}
		System.out.println();
		
		 //******************Insertion sort for integers
	    System.out.println("******************Insertion sort for integers*******************************");

		long insertionsortStartTime = curretnTime();
		Integer[] insertionSortedArray = Utility.insertionSort(userIntegerArray);
		long insertionsortEndTime = curretnTime();
		long totalInsertionSortElapsedTime = insertionsortEndTime - insertionsortStartTime;
		System.out.println("Total time for insertion sort:"+totalInsertionSortElapsedTime);
		
		strArray[1]="Insertion sort for integer";
		intArray[1]= totalInsertionSortElapsedTime;
        
		System.out.print("The sorted array is: ");
		for (int i:insertionSortedArray) {
			System.out.print(i+"  ");
		}
		System.out.println();

		//************************binary search for integers
	    System.out.println("******************Binary Search for integers*******************************");

		System.out.print("Enter the Element want to search: ");
		Integer userSearch=scanner.nextInt();
		int low=0;
		int high=insertionSortedArray.length;
		
		long binarysearchStartTime=curretnTime();
		int loc=Utility.binarySearch(insertionSortedArray,low,high-1,userSearch);
		if(loc==-1){
			System.out.println("element not found");

		}
		else {	
			
			long binarysearchEndTime=curretnTime();
			long binarysearchTotalElapsedTime = binarysearchEndTime - binarysearchStartTime;
			System.out.println("Element postion is : "+loc);
			System.out.println("Total time for binarySearch: "+binarysearchTotalElapsedTime);
		
		}
		System.out.println();
		
		
		if (intArray[1]>intArray[0])
        	System.out.println(strArray[0]+":"+intArray[0]);
            System.out.println(strArray[1]+":"+intArray[1]);

		
		 //******************Bubble sort for strings
	    System.out.println("******************Bubble sort for strings*******************************");

		String [] userStringArray={"hemanth","sunny","kasireddy","reddy","Mr."};
		long bubblesortStartTimeForString=curretnTime();
		String [] bubblesortStringSortedArray=Utility.bubbleSort(userStringArray);
		long bubblesortEndTimeForString=curretnTime();
		
        long bubblesortTotalElapsedTime=bubblesortEndTimeForString-bubblesortStartTimeForString;
 		System.out.println("Total time for bubble sort: " + bubblesortTotalElapsedTime);
		System.out.print("The sorted array is: ");
         
		for (String str:bubblesortStringSortedArray)
			System.out.print(str+"	");
		
		System.out.println();
		
		System.out.println("the sorted order");

		
		strArray[0]="Bubble sort For strings";
		intArray[0]=bubblesortTotalElapsedTime;

		 //******************Insertion sort for strings
	  
		System.out.println("******************Insertion sort for strings*******************************");
	    long insertionsortStartTimeForString=curretnTime();
		String[] insertionsortStringSortedArray=Utility.insertionSort(userStringArray);
	    long insertionsortEndTimeForString=curretnTime();
        long insertionsortTotalElapsedTime=insertionsortEndTimeForString-insertionsortStartTimeForString;

 		System.out.println("Total time for insertion sort:"+insertionsortTotalElapsedTime);

		System.out.print("The sorted array is: ");
		for (String str:insertionsortStringSortedArray)
			System.out.print(str+"	");
		System.out.println();
        
		strArray[1]="Insertion sort For strings";
		intArray[1]=insertionsortTotalElapsedTime;

		
	    System.out.println("******************binary search for strings*******************************");

		System.out.print("Enter the Element want to search: ");
		
		String userSearchForString=scanner.next();
		
		int low1=0;
		int high1=insertionsortStringSortedArray.length;
		
		long binarysearchStartTimeString=curretnTime();
		int stringLoc=Utility.binarySearch(insertionsortStringSortedArray, low1, high1, userSearchForString);
		if(stringLoc==-1) {
			System.out.println("element not found");
		} else {
		
			long binarysearchEndTimeString=curretnTime();
	        long binarysearchTotalElapsedTimeForString= binarysearchStartTimeString - binarysearchEndTimeString;
	 		System.out.println("Total time for insertion sort:" + binarysearchTotalElapsedTimeForString);


	 		
			System.out.println("the element positionis : "+stringLoc);
			 
			System.out.println("the sorted order");
			if (intArray[1]>intArray[0]) {
	        	System.out.println(strArray[0]+":"+intArray[0]);
			} else {
	            System.out.println(strArray[1]+":"+intArray[1]);
	            
			}

		}
		scanner.close();
	}
}
