/***********************************************
 * Purpose :This program calculate​ ​the​ ​minimum​ ​number of​ Notes​ as​ well​ as​ the​ ​
 * 			 Notes​​ to​​ be​ returned​ by​ the​​ Vending​​ Machine​​ as​ a Change​
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class VendingMachine {


	public static void main(String[] args) {
		
		int change=Integer.parseInt(args[0]);
		int notes[]={1000,500,100,50,10,2,1};
		int noteCount[]=new int[notes.length];
		Utility.returnNotes(noteCount,change,0);
		
		for(int i=0;i<notes.length;i++){
			if(noteCount[i]!=0)
				System.out.println(notes[i]+" Rs note= "+noteCount[i]);
		}
		
	}

}
