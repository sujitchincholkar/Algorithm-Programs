/***********************************************
 * Purpose :This program reads data from file and search for word
 * 			entered by user.​
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FileSearch {
	public static void main(String args[]) {
		String words[]={},search;
		Scanner scanner;
		words =Utility.readFile("/home/bridgeit/Documents/myfile");
		System.out.println("Enter word to search");
		scanner=new Scanner(System.in);
		search=scanner.next().trim();
		Utility.bubbleSort(words);
		if(Utility.binarySearch(words, search)){
			System.out.println("The Word is present");
		}else {
			System.out.println("The Word is not present");
		}
		scanner.close();
	}
}
