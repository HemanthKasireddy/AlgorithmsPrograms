package com.bridgeit.JavaAlgorithmPrograms.Programs;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgeit.JavaAlgorithmPrograms.Utility.Utility;

public class PrimeNumbersRange {

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int low=scanner.nextInt();
		System.out.print("Enter the second number : ");
		int high=scanner.nextInt();
		//calling parent class method
		ArrayList<Integer> primeNumbersList=Utility.primeNumbers(low, high);
		
		for(int primeNumber:primeNumbersList) {
			
			System.out.println("The prime number is:  "+primeNumber);
		}
		scanner.close();
	}
}
