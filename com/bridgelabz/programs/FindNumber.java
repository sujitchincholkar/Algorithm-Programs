/***********************************************
 * Purpose :This program ​ ​ takes​ ​ a ​ ​ command-line​ ​ argument​ ​ N,​ ​ asks​ ​ you​ ​ to​ ​ think​ ​ of​ ​ a ​ ​
 * 			 number between​ ​ 0 ​ ​ and​ ​ N-1,​ ​ where​ ​ N ​=​ 2^n,​and​​ always​​ guesses​​ the​ answer​ with​ n
 *			questions​
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FindNumber {
	
	public static void main(String[] args) {
		int range=Integer.parseInt(args[0]);
		System.out.println("Think  number between 0 to "+(range-1));
		Utility.findNumber(0, range-1);
	}
	
}
