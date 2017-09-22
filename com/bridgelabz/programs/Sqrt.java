/***********************************************
 * Purpose :This program compute the square root of a nonnegative number c
 *			given​ ​ in​ ​ the​ ​ input​ ​ using​ ​ Newton's​ ​ method: 
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Sqrt {

	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		System.out.println(Utility.sqrt(number));
		
	}

}
