package com.bridgeit.JavaAlgorithmPrograms.Programs;

import java.util.Scanner;
import com.bridgeit.JavaAlgorithmPrograms.Utility.Utility;

public class VendingMachine {

	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter how much change want: ");
		try{
			 int userAmount=scanner.nextInt();
			 if(userAmount>0) {
			   Utility.changeRequired(userAmount);
			 } else { 
				 System.out.println("Your entered wrong amount :");
			 }
		}
        catch(Exception ex){
			
			System.out.println("The \" "+ex+" \" Exception is raised");
			System.out.println("Exception Details are: ");
			ex.printStackTrace();
		}
		finally{
			scanner.close();
		}
	}

}
