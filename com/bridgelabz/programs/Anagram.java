/***********************************************
 * purpose : This program checks if strings are anagram or not.
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		String string1,string2;
		Scanner scanner=new Scanner(System.in);
		string1=scanner.next();
		string2=scanner.next();
		if (Utility.isAnagram(string1, string2)) {
			System.out.println(string1 + " " + string2 + " are anagram");
		} else {
			System.out.println(string1 + " " + string2 + " are not an anagram");
		}
	}

}
