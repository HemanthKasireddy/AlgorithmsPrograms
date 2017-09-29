package com.bridgeit.JavaAlgorithmPrograms.Programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgeit.JavaAlgorithmPrograms.Utility.Utility;

public class BinarySearch {
	public static void main(String [] args) {
		File file=new File("/home/bridgeit/Desktop/Hemanth_WorkSpace/BinarySearchFile");
		
		FileWriter fileWriter=null;
		FileReader fileReader=null;
		BufferedReader br=null;
		String []words=null;
		Scanner scanner=new Scanner(System.in);
		try {
				if (file.exists()){
					
					if (file.canWrite()){
				
						 fileWriter=new FileWriter(file);
						 fileWriter.write("hi,hello,this,is,hemanth,kasireddy,nice,to,meet,you,i,hope,your,good,thanks");
						 fileWriter.flush();
						 fileWriter.close();
			        } else {
				         System.out.println("you can't write in this file");
			        }
					
					 if(file.canRead()) {
					
						fileReader=new FileReader(file);
						br=new BufferedReader(fileReader);
						String s;
						
						while((s=br.readLine())!=null) {
							words=s.split(",");
						}	
						 fileReader.close();
						 br.close();
						 System.out.println("Enter The word you want to search: ");
						 String usersearch=scanner.nextLine();
						 String [] sortedArray=Utility.insertionSort(words);
						 int low=0;
						 int high=sortedArray.length;
						 int check=Utility.binarySearch(sortedArray, low, high, usersearch);
						
						 if(check==-1) {
							
							 System.out.println("Word is not found");
						 
			             } else {
			    	            System.out.println("Word is found");
			              }
						 
					 } else {
						
						 System.out.println("you can't read this file");
					  }
					
		         } else {
		        	
		        	 System.out.println("File not exists");
		         }
				
				
		    } catch (IOException e) {

		       e.printStackTrace();
	        } finally {
	
			  scanner.close();
		
	        }
	}
}