/***********************************************
 * Purpose :This program given the temperature in fahrenheit as input outputs the
 * 			 temperature in Celsius or vice versa.​
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class TempuratureConvert {
	public static void main(String args[]){
		float temperature=Integer.parseInt(args[0]);
		char currentUnit=args[1].charAt(0);
		System.out.println(Utility.convertTemperature(temperature, currentUnit));
		
	}
	
}
