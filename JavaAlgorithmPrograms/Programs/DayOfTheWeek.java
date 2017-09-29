package com.bridgeit.JavaAlgorithmPrograms.Programs;

import com.bridgeit.JavaAlgorithmPrograms.Utility.Utility;

public class DayOfTheWeek {

	 enum Days   {Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}
		public static void main(String [] args){
			int month=Integer.parseInt(args[0]);
			int day=Integer.parseInt(args[1]);
			int year=Integer.parseInt(args[2]);
			int result=Utility.findDayOfWeek(month,day,year);
			System.out.println("The week of the day is : "+Days.values()[result]);
		}
}
