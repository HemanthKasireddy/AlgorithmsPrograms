package com.bridgeit.JavaAlgorithmPrograms.Programs;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgeit.JavaAlgorithmPrograms.Utility.Utility;

public class Binary {
	
	
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		try{
			System.out.println("Enter a number: ");
			int number=scan.nextInt();
			
			//Storing result into Array list
			ArrayList<Integer>binaryArrayList=Utility.convertToBinary(number);
			Utility.printBinaryArray(binaryArrayList,number);
			
			
		}
		catch(Exception ex){
			
			System.out.println("The \" "+ex+" \" Exception is raised");
			ex.printStackTrace();
		}
		finally{
			scan.close();
		}
	}
	
}
