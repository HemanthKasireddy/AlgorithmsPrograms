package com.bridgeit.JavaAlgorithmPrograms.Programs;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgeit.JavaAlgorithmPrograms.Utility.Utility;

public class PrimePalindrome {
	
	public static void main(String []args){
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int low=scanner.nextInt();
		System.out.print("Enter the second number : ");
		int high=scanner.nextInt();
		
		ArrayList<Integer> primePalindromeList=Utility.primeNumberPalindrome(low,high);
		
		for(int primePalindrome:primePalindromeList) {
			System.out.println("The prime palindrome is:  "+primePalindrome);
		}
		scanner.close();
	}
}
