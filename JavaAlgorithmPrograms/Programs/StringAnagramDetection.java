package com.bridgeit.JavaAlgorithmPrograms.Programs;

import java.util.Scanner;

import com.bridgeit.JavaAlgorithmPrograms.Utility.Utility;

public class StringAnagramDetection {
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the  first String for checiking anagram");
		
		String string1=scanner.nextLine().toLowerCase();
		System.out.println("Enter the second String for checiking anagram");

		String string2=scanner.nextLine().toLowerCase();
		// calling parent class method
		boolean check=Utility.checkStringIsAnagram(string1,string2);
		if (check==true) {
			System.out.println("Given strings are \"Anagrams\"");
		} else {
			System.out.println("Given strings are \"Not a anagrams\"");
		}
		scanner.close();
	}

}
