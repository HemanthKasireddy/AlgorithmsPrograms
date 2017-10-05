package com.bridgeit.JavaAlgorithmPrograms.Utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class Utility {
	
	/**
	 * @param unSortedArray
	 * @return
	 * @author Hemanth
	 * <p> This method for sorting elements using bubble sort technique 
	 */

	public static <T extends Comparable<T>> T[] bubbleSort(T[] unSortedArray){
		for(int i=0;i<unSortedArray.length;i++){
			
			boolean isSwaped=false;
			
		   for(int j=0;j<unSortedArray.length-i-1;j++){
		      
			   if (unSortedArray[j].compareTo( unSortedArray[j+1])>0) {
		          
				   T temp = unSortedArray[j];
				   unSortedArray[j]=unSortedArray[j+1];
				   unSortedArray[j+1]=temp;
		           isSwaped=true;
		          
		      }  
		   }
		   if(isSwaped==false)
		    	  break;
		}
		return unSortedArray;
		
	}
	//prime numbers utility function
	/**
	 * @param low
	 * @param high
	 * @return
	 * @author Hemanth
	 * <p> This method for generating prime numbers
	 */
	public static ArrayList<Integer> primeNumbers(int low,int high) {
		
		ArrayList<Integer> primeNumbersList=new ArrayList<Integer>();
		
			for(int i = 2; i <=high; i++) {
				
                 boolean isPrime=true;
	             for( int j = 2; j < i; j++){
	             
	                 if(i % j == 0) {
	                 
	                     isPrime=false;
	                 }    
	             }
	             if(isPrime) 
	            	 primeNumbersList.add(i);   
	             
	         }
		return primeNumbersList;
	}
	
	/**
	 * @param low
	 * @param high
	 * @return
	 * @author Hemanth
	 * <p> This method for checking prime numbers are palindrome 
	 */
	public static ArrayList<Integer> primeNumberPalindrome(int low, int high) {
		//calling prime numbers method
		ArrayList<Integer>primeNumbersList  =primeNumbers(low,high);
		// to store prime palindromes 
		ArrayList<Integer> palindromeList= new  ArrayList<Integer>();
		
		for(int index=0;index<primeNumbersList.size();index++){
			
			int primeNumber=primeNumbersList.get(index);
			// copied number into variable
			
			int palindrome = primeNumber; 
	        int reverse = 0;
	        while (palindrome != 0) {
	            int remainder = palindrome % 10;
	            reverse = reverse * 10 + remainder;
	            palindrome = palindrome / 10;
	        }
	
	        // if original and reverse of number is equal then only
	        // number is palindrome 
	        
	        if (primeNumber == reverse) {
	        	//System.out.println(primeNumber);
	        	palindromeList.add(primeNumber);
	
	        }
		}
		
		return palindromeList;
	}

	//utility function for strings anagram 
	/**
	 * @param str1
	 * @param str2
	 * @return
	 * @author Hemanth
	 * <p> This method for checking given string is anagram or not
	 */
	public static boolean checkStringIsAnagram(String str1, String str2) {
	
		  if(str1.length()==str2.length()) {
			  
			 char[] charArray=str1.toCharArray();
			 Character[] arr1=new Character[charArray.length];
			 int i=0;
			 for(char ch:charArray) {
				 arr1[i++]=Character.valueOf(ch);
			 }
			 
			 Character []charArr1=bubbleSort(arr1);	 
			 char[] charArray2=str2.toCharArray();
			 Character[] arr2=new Character[charArray2.length];
			 int j=0;
			 for(char ch:charArray) {
				 arr2[j++]=Character.valueOf(ch);
			 }
			 
			 Character []charArr2=bubbleSort(arr1);		
		
	     for (int k=0;k<charArr1.length;k++) {
	    	 if (charArr1[k]!=charArr2[k])
	    		 return false;
	     }
	     return true;
	 }
	 else
	 return false;
	}
	/**
	 * @param t
	 * @return
	 * @author Hemanth
	 * <p> This method for sorting elements using insertion sort technique  
	 */
	public static <T extends Comparable<T>> T[] insertionSort(T[] t) {
		for(int i=1;i<t.length;i++){
			T key=t[i];
			int j=i-1;
			while(j>= 0 && t[j].compareTo(key)>0){
				t[j+1]=t[j];
				j--;
			}
			t[j+1]=key;
		}
	return t;
	}

	/**
	 * @param t
	 * @param low
	 * @param high
	 * @param userSearch
	 * @return
	 * @author Hemanth
	 * <p> This method for searching elements using binary search technique 
	 */
	public static <T extends Comparable<T>> int binarySearch(T[] t,int low,int high, T userSearch) {
		//sorting the user input array 
		
		if(high>=low){
			
            int mid = low + (high - low)/2;

            if (t[mid]==userSearch)
            	return mid;
            
            if(t[mid].compareTo(userSearch)>0)
            	
            	return binarySearch(t,low,mid-1,userSearch);
            
            return binarySearch(t,mid+1,high,userSearch);
		}
		return -1;

	}
	
	/**
	 * @param temperatur
	 * @param check
	 * @return
	 * @author Hemanth
	 * <p> This method for converting temperature celsius to fahrenheit or viceversa
	 */
	public static float temperaturConversion(float temperatur, String check){
		if(check=="c"){
		      return (temperatur-32f)*( 5f/9f); 
		}
		else
			{
			return (temperatur*(9f/5f))+32f ;
			}
	}
	 
	/**
	 * @param month
	 * @param day
	 * @param year
	 * @return
	 * @author Hemanth
	 * <p> This method for find first day of week 
	 */
	public static int findDayOfWeek(int month, int day, int year) {
		int y = year-(14 - month) / 12;
		int x = y + y/4-y/100 + y/400;
		int	m = month + 12 *((14-month) / 12)- 2;
		int	d = (day + x + (31*m)/12)% 7;

		return d;
	}
	
	
	/**
	 * @param principalAmount
	 * @param n
	 * @param r
	 * @return
	 * @author Hemanth
	 * <p> This method for find monthly payment on loan
	 */
	public static double monthlyPayment(double principalAmount, double n, double r) {
		return (principalAmount*r)/(1-Math.pow(1+r, -n));
		
	}
	/**
	 * @param number
	 * @return
	 * @author Hemanth
	 * <p> This method for find square roots of given number using nuton method
	 */
	public static double findSquareRoot(double number) {
		double epsilon=1e-15;
		double temp=number;
		
		while(Math.abs(temp-(number/temp))> epsilon*temp){
			temp=((number/temp)+temp)/2.0;
		}
		return temp;
	}

	/**
	 * @param number
	 * @return
	 * @author Hemanth
	 * <p> This method for converting decimal to binary
	 */
	public static ArrayList<Integer> convertToBinary(int number) { 
		ArrayList<Integer> binaryArray=new ArrayList<Integer>();
		try{
			int remainder=0;
			while(number>0){
				
				remainder=number%2;
				binaryArray.add(remainder);
				number=number/2;
				
			}

		}
		catch(Exception ex){
			
			System.out.println("The \" "+ex+" \" Exception is raised");
			ex.printStackTrace();
		}
		return binaryArray;
		
	}
	
	/**
	 * @param binary
	 * @return
	 * @author Hemanth
	 * <p> This method for converting binary to decimal
	 */
	private static int toDecimal(int binary) {
		  
        int decimal = 0;
        int power = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, power);
                binary = binary/10;
                power++;
            }
        }
        return decimal;
		
	}
	//checking number is power of two
	/**
	 * @param decimalNumber
	 * @return
	 * @author Hemanth
	 * <p> This method for checking whether give number is power of two or not
	 */
	private static boolean isPowerOfTwo(int decimalNumber) {
		if (decimalNumber == 0)
		    return false;
		while (decimalNumber!= 1)
		  {
		    if (decimalNumber%2 != 0)
		      return false;
		    decimalNumber = decimalNumber/2;
		  }
		return true;
	}
	/**
	 * @param binaryArrayList
	 * @return
	 * @author Hemanth
	 * <p> This method for padding extra zeros to make 8 bit binary number
	 */
	private static int [] padding(int[] binaryArrayList) {

		int paddingZeros=8-binaryArrayList.length;
		int []paddingArray=new int[8];
	
		for(int i=paddingZeros,j=0;i<paddingArray.length;i++,j++) {
			paddingArray[i]=binaryArrayList[j];
		}
		return paddingArray;
	}
	/**
	 * @param binaryArrayList
	 * @param number
	 * @author Hemanth
	 * <p> This method for displaying binary number after swapping the octels 
	 */
	public static void printBinaryArray(ArrayList<Integer> binaryArrayList, int number) {
		
		
		int []binarySwapedArray=new int[binaryArrayList.size()];
		
		//storing Array list values into array in reverse order
		System.out.print("The binary form of \""+number+"\" is :  ");
		for(int index=binaryArrayList.size()-1,i=0;index>=0;index--,i++) {
			System.out.print(binaryArrayList.get(index));
			binarySwapedArray[i]=binaryArrayList.get(index);
		}
		System.out.println();
		int []paddingArray=padding(binarySwapedArray);

		int []swappedArray=new int[paddingArray.length];
		System.out.print("After padding binary form is: ");
		
		for(int i:paddingArray) {
		 System.out.print(i);
	    }
		//storing left half octal into swapped array 
		
		for(int i=0,j=(paddingArray.length/2);i<swappedArray.length/2;i++,j++) {
			swappedArray[i]=paddingArray[j];
		}
		
		//storing right half octal into swapped array 

		for(int i=(swappedArray.length/2),j=0;i<swappedArray.length;i++,j++) {
			swappedArray[i]=paddingArray[j];
		}
		System.out.println();
		String s="";
		for(int i=0;i<swappedArray.length;i++) {
			s=s+swappedArray[i];
		}
		System.out.print("After swaping octals binary form is :");
		System.out.println(s);
		System.out.println();
		
		//while passing converting into integer
	    int decimalNumber=toDecimal(Integer.parseInt(s));
	    System.out.println("After swapping octals number is: "+decimalNumber);
	  
	  //calling isPowerOfTwo method with argument of Decimal number
	    boolean check= isPowerOfTwo(decimalNumber);
	    if(check==true)
		   System.out.println(decimalNumber+" is power of two");
	    else
		   System.out.println(decimalNumber+" is \" NOT \" a power of two");

	}
	

	/**
	 * @param unSortedStringArray
	 * @param low
	 * @param mid
	 * @param high
	 * @author Hemanth
	 * <p> This method for merging of two strings
	 */
	public static void mergeStrings(String [] unSortedStringArray,int low,int mid,int high){
		
		int leftLength=mid-low+1;
		int rightLength=high-mid;
		int k=low;
		//temp arrays to sore data in unSortedStringArray 
		String []leftArray=new String[leftLength];
		String []rightArray=new String[rightLength];
		//copying data to arrays
		for (int i=0; i<leftLength; ++i)
		 leftArray[i] = unSortedStringArray[low + i];
		for (int j=0; j<rightLength; ++j)
    	 rightArray[j] = unSortedStringArray[mid + 1+ j];
    
		int i=0,j=0;
		//merging temp arrays 
		while( i < leftLength && rightLength > j ){
    	 
			if( rightArray[j].compareTo(leftArray[i])>=0){
    		 
				unSortedStringArray[k]=leftArray[i];
				i++;
    		 
			} else {
    	    	 unSortedStringArray[k]=rightArray[j];
    	    	 j++;
    	     }
    	 k++;
     }
     //Copy remaining elements of leftArray
     while (i < leftLength)
     {
    	 unSortedStringArray[k] = leftArray[i];
         i++;
         k++;
     }

     //Copy remaining elements of rightArray

     while (j < rightLength)
     {
    	 unSortedStringArray[k] = rightArray[j];
         j++;
         k++;
     }
    
	}
	/**
	 * @param unSortedStringArray
	 * @param low
	 * @param high
	 * @author Hemanth
	 * <p> This method for sorting the strings
	 */
	public static void sortStrings(String[] unSortedStringArray,int low,int high){
		
		 int mid = low + (high - low) / 2;
		 
		 if(low<high){
		     //recursion algorithm
			 sortStrings(unSortedStringArray,low,mid);
			 sortStrings(unSortedStringArray,mid+1,high);
			 mergeStrings(unSortedStringArray,low,mid,high);
			
		 }
	}
	private static int oneCount,twoCount,fiveCount,tenCount,fiftyCount,hundredCount,fiveHundredCount,thousundCount;

	/**
	 * @param userAmount
	 * @author Hemanth
	 * <p> This method for find required change of given amount
	 */
	public static void changeRequired(int userAmount) {

	    try{

			//storing notes according to notes name and values
			LinkedHashMap<String,Integer> mapChange=new LinkedHashMap<String,Integer>();
			// using recursion technique to denomination of money
			
			if(userAmount>=1000){
				userAmount-=1000;
				thousundCount++;
				changeRequired(userAmount);
			}
			else if(userAmount>=500){
				userAmount-=500;
				fiveHundredCount++;
				changeRequired(userAmount);
			}
			else if(userAmount>=100){
				userAmount-=100;
				hundredCount++;
				changeRequired(userAmount);
			}
			else if(userAmount>=50){
				userAmount-=50;
				fiftyCount++;
				changeRequired(userAmount);
			}
			else if(userAmount>=10){
				userAmount-=10;
				tenCount++;
				changeRequired(userAmount);
			}
			else if(userAmount>=5){
				userAmount-=5;
				fiveCount++;
				changeRequired(userAmount);
			}
			else if(userAmount>=2){
				userAmount-=2;
				twoCount++;
				changeRequired(userAmount);
			}
			else if(userAmount>=1){
				userAmount-=1;
				oneCount++;
				changeRequired(userAmount);
			}
			else{
				    // when denomination is 0 then it  will enter the else block 
				    // putting the all the values in to linkedHashMap according to key-value pair
					mapChange.put("five hundred",fiveHundredCount);
					mapChange.put("thousund", thousundCount);
					mapChange.put("hundred",hundredCount);
					mapChange.put("fifty",fiftyCount);
					mapChange.put("ten",tenCount);
					mapChange.put("five",fiveCount);
					mapChange.put("two",twoCount);
					mapChange.put("one",oneCount);
					
					//removing all the keys with have 0's by using singleton()
					//singleton() will return all the matching values of 0's and remove all remove those values keys in map
					mapChange.values().removeAll(Collections.singleton(0));
				    System.out.println("minimum " + mapChange.size()+" types of notes are required");
				    //taking the all keys in map by using keySet() and adding into set
					Set<String> keys = mapChange.keySet();
			        for(String k:keys){
			            System.out.println(k+"'s notes "+mapChange.get(k)+" are required");
		             }
			}
		}
		 catch(Exception ex){
				
				System.out.println("The \" "+ex+" \" Exception is raised");
				System.out.println("Exception Details are: ");

				ex.printStackTrace();
			}
	}

	/**
	 * @param UserGuesses
	 * @param low
	 * @param high
	 * @author Hemanth
	 * <p> This method for start the guesser game 
	 */
	public static void gameStart(int[] UserGuesses, int low, int high) {

		Scanner scanner= new Scanner(System.in);
		try {
			 if(high<=low) {
				 System.out.println("Number is: "+low);
				 System.exit(0);
			 }
			 int mid=(low+high)/2;
			 System.out.println("Number is in : "+low +" - "+mid);
			 System.out.println("choose you choice: ");
		     System.out.println("1.True          2.False");
			 int response= scanner.nextInt();
			 if(response==1) {
        	
				 gameStart(UserGuesses,low,(mid-1));
			 } else {
				 gameStart(UserGuesses,(mid+1),high);
              }
		System.out.println();	 
			 
       } catch(Exception ex) {
			
			System.out.println("The \" "+ex+" \" Exception is raised");
			ex.printStackTrace();
		}
		finally{
			scanner.close();
		}
	}	

}
