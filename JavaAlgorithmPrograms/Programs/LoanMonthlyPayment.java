package com.bridgeit.JavaAlgorithmPrograms.Programs;

import com.bridgeit.JavaAlgorithmPrograms.Utility.Utility;

public class LoanMonthlyPayment {
	
	public static void main(String []args){
		try{
			double principalAmount=Double.parseDouble(args[0]);
			double years=Double.parseDouble(args[1]);
			double rateOfInterest=Double.parseDouble(args[2]);
			double n=12*years;
			double r=rateOfInterest/(12*100);
			double payment=Utility.monthlyPayment(principalAmount, n, r);
			System.out.println("The monthly payment is Rs\\-: "+Math.round(payment ));
	       }
		catch(Exception ex){
				
				System.out.println("The \" "+ex+" \" Exception is raised");
				ex.printStackTrace();
			}
	}
}
