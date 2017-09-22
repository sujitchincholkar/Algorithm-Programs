/***********************************************
 * Purpose :​
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.programs;

import java.util.Comparator;

public class Compare<T>  implements Comparable<T> {

    public T value;

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		if(((Comparable<T>) value).compareTo(o)>0){
			return 1;
		}else if(((Comparable<T>) value).compareTo(o)<0){
			return -1;
		}
		return 0;
	}


}
