package com.bridgeit.JavaAlgorithmPrograms.Programs;

import java.util.Scanner;

import com.bridgeit.JavaAlgorithmPrograms.Utility.Utility;

public class GuesserGame {
	
	public static void main(String[] args){
		Scanner	scanner=new Scanner(System.in);
		try {  
			 System.out.println("Enter your number range to search: ");
			 int number=scanner.nextInt();
			 // int number=Integer.parseInt(args[0]);
			 System.out.println("Think any number between '0' and "+(number-1)+"\n");
		     int[] userGuessArray=new int[number];
		     for(int i=0;i<number;i++) {
		        userGuessArray[i]=i;
		     }

			 Utility.gameStart(userGuessArray,0,(number-1));
		}
		catch(Exception ex){
			
			System.out.println("The \" "+ex+" \" Exception is raised");
			ex.printStackTrace();
		} finally {
			scanner.close();
		}
		
	}      
}  