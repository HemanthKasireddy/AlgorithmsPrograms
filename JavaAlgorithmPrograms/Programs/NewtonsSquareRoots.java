package com.bridgeit.JavaAlgorithmPrograms.Programs;

import java.util.Scanner;

import com.bridgeit.JavaAlgorithmPrograms.Utility.Utility;

public class NewtonsSquareRoots {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("Enter a number to find square root: ");
			double number=scanner.nextDouble();
			System.out.println("The square root of "+number+" is "+Utility.findSquareRoot(number));
			
		} catch(Exception ex) {
			
			System.out.println("The \" "+ex+" \" Exception is raised");
			ex.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
