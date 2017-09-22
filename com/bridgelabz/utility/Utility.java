/***********************************************
 * purpose : To store all logic of the programs
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.programs.Compare;

public class Utility {
	static Scanner scanner = new Scanner(System.in);
	/**This method checks if given strings are anagram
	 * @param string1
	 * @param string2
	 * @return It returns true if strings are anagram
	 */
	public static boolean isAnagram(String string1, String string2) {
			boolean isAnagram = true;
			char array1[] = string1.toLowerCase().toCharArray();
			char array2[] = string2.toLowerCase().toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			if (array1.length != array2.length) {
				return false;
			} else {
				for (int i = 0; i < array1.length; i++) {
					if (array1[i] == array2[i]) {
						isAnagram = true;
					} else {
						isAnagram = false;
						break;
					}
	
				}
			}
			return isAnagram;
		}
	
	/**This method checks if given string is palindrome or not
	 * @param string
	 * @return	returns true if string is palindrome
	 */
	public static boolean isPalindrome(String string) {
			char array[] = string.toLowerCase().toCharArray();
			boolean isPalindrome = true;
			int j = array.length - 1;
			for (int i = 0; i < array.length; i++, j--) {
				if (array[i] == array[j]) {
					isPalindrome = true;
				} else {
					isPalindrome = false;
					return isPalindrome;
				}
			}
			return isPalindrome;
	
		}
	
	/**This method checks if given number is prime or not
	 * @param number
	 * @return It returns true if number is prime
	 */
	public static boolean isPrime(int number) {

		// condition to check if no less than two
		if (number < 2) {
			return false;
		}

		// for loop to for checking prime no
		for (int factor = 2; factor * factor <= number; factor++) {
			// if factor divides evenly into n, n is not prime, so break out of
			// loop
			if (number % factor == 0) {
				return false;

			}
		} // End of for loop
		return true;
	}

	/**This method prints prime numbers from 0 to 1000
	 * 
	 */
	public static void printPrimes() {
		int number = 0;
		for (number = 2; number <= 1000; number++) {
			if (isPrime(number)) {
				System.out.println(number);
			}
		}
	}

	/**This method prints prime number which are palindrome
	 * 
	 */
	public static void printPrimePalindrome() {
		for (int number = 2; number < 1000; number++) {
			if (isPrime(number)) {
				if (isPalindrome(Integer.toString(number))) {
					System.out.println(number);
				}
			}
		}
	}

	/**This method check if given number is present in array 
	 * @param array
	 * @param number
	 * @return true if number is present in array otherwise returns false 
	 */
	public static boolean binarySearch(int array[], int number) {

		int low = 0;
		boolean isPresent = false;
		int high = array.length - 1;
		int mid = high / 2;
		while (high >= low) {
			if (array[mid] == number) {
				isPresent = true;
				break;
			} else if (array[mid] > number) {
				high = mid - 1;
				mid = (low + high) / 2;
			} else if (array[mid] < number) {
				low = mid + 1;
				mid = (low + high) / 2;
			}
		}
		return isPresent;
	}


	/**This method check if given number is present in array 
	 * @param array
	 * @param number
	 * @return true if number is present in array otherwise returns false 
	 */
	public static <T extends Comparable<T>> boolean binarySearch(T array[], T search) {
		int low = 0;
		boolean isPresent = false;
		int high = array.length - 1;
		int mid = high / 2;
		while (high >= low) {
			if (array[mid].compareTo(search) == 0) {
				isPresent = true;
				break;
			} else if (array[mid].compareTo(search) < 0) {
				low = mid + 1;
				mid = (low + high) / 2;
			} else if (array[mid].compareTo(search) > 0) {
				high = mid - 1;
				mid = (low + high) / 2;
			}
		}
		return isPresent;
	}

	/**This method sort the given array in ascending order
	 * @param array
	 */
	public static void insertionSort(int array[]) {

		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}

	}
	/**This method sorts array in descending order
	 * @param array
	 */
	public static void insertionSortDesc(int array[]) { 
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] < key) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}

	}
	/**This method sort the given array in ascending order
	 * @param array
	 */
	public static <T extends Comparable<T>> void insertionSort(T array[]) {

		for (int i = 1; i < array.length; i++) {
			T key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j].compareTo(key) > 0) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}

	}

	/**This method sorts given array
	 * @param array
	 */
	public static void bubbleSort(int array[]) {

		int temp;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

	}

	/**This method sort the given array in ascending order
	 * @param array
	 */
	public static <T extends Comparable<T>> void bubbleSort(T array[]) {
		T temp;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
	
	/**This method gives day of week for given day/month/year
	 * @param day
	 * @param month
	 * @param year
	 * @return returns 0 for sunday,1 for monday and so on
	 */
	public static int dayOfWeek(int day, int month, int year) {
		int m0, y0, d0, x;

		y0 = year - (14 - month) / month;
		x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		m0 = month + 12 * ((14 - month) / 12) - 2;
		d0 = (day + x + (31 * m0) / 12) % 7;
		return d0;
	}

	/**This method converts temperature from current time unit to alternative unit
	 * @param temperature
	 * @param currentUnit
	 * @return
	 */
	public static float convertTemperature(float temperature, char currentUnit) {
		float conversion = 0.0f;
		if (currentUnit == 'f' || currentUnit == 'F') {
			conversion = (temperature - 32) * ((float) 5 / 9);
		} else if (currentUnit == 'c' || currentUnit == 'C') {
			conversion = (temperature * ((float) 9 / 5)) + 32;
		}
		return conversion;
	}

	/**This method calculates monthly payment for given payment,rate and time in years
	 * @param payment
	 * @param rate
	 * @param year
	 * @return returns monthly payment
	 */
	public static float monthlyPayment(float payment, float rate, float year) {
		float monthlyPay = 0.0f;
		int months = (int) (12 * year);
		float r = rate * ((float) rate / 12 * 100);
		monthlyPay = (float) ((payment * r) / (1 - Math.pow(1 + r, -months)));
		return monthlyPay;
	}

	/**This method calculates square root of give number
	 * @param number
	 * @return returns square root
	 * 
	 */
	public static double sqrt(int number) {
		double epslion = 1e-15;
		double t = number;

		while (Math.abs(t - number / t) > epslion * t) {
			t = (number / t + t) / 2;
		}
		return t;
	}

	/**This method converts decimal number into binary
	 * @param number
	 * @return returns binary number
	 */
	public static String toBinary(int number) {
		int rem;
		String bin[] = { "0", "1" };
		String binary = "";
		int padding = 0;
		while (number > 0 || padding % 8 != 0) {
			rem = number % 2;
			binary = bin[rem] + binary;
			number = number / 2;
			padding++;
			if (padding % 4 == 0 && number != 0) {
				binary = " " + binary;

			}
		}
		return binary;
	}

	/**This method swap nibbles of given binary
	 * @param binary
	 * @return returns swapped binary
	 */
	public static String swappedNibbles(String binary) {
		binary = binary.replaceAll(" ", "");
		String lowerNibble = binary.substring(0, 4);
		String upperNibble = binary.substring(4, 8);
		String swappedBinary = upperNibble + lowerNibble;
		return swappedBinary;
	}

	/**This method check if number is power of two or not
	 * @param number
	 * @return returns true if number is power of 2
	 */ 
	public static boolean isPowerOfTwo(int number) {
		int power = 0;
		int division = number;
		while (division > 1) {
			division = division / 2;
			power++;
		}
		return number == (int) Math.pow(2, power);
	}

	/**This method converts binary to decimal
	 * @param binary
	 * @return Converted decimal number
	 */
	public static int binaryToDecimal(String binary) {
		int decimal = 0, power = 0;
		binary = binary.replaceAll(" ", "");
		int index = binary.length() - 1;
		while (index >= 0) {
			decimal = decimal+(int)(Integer.parseInt(binary.charAt(index) + "") * Math
					.pow(2, power));
			power++;
			index--;
		}
		return decimal;

	}

	/**This method prints prime number which is anagram
	 * 
	 */
	public static void primeAnagram() {
		ArrayList<String> primes = new ArrayList<>();
		for (int i = 0; i < 1000; i++) {
			if (isPrime(i)) {
				primes.add(String.valueOf(i));
			}
		}
		for (int i = 0; i < primes.size(); i++) {
			for (int j = i + 1; j < primes.size(); j++) {
				if (isAnagram(primes.get(i), primes.get(j))) {
					System.out.println(primes.get(i) + " " + primes.get(j)
							+ " are anagram");
				}
			}
		}

	}

	/**This method calculates time difference between start time and current time
	 * @param start
	 * @return returns time in milliseconds
	 */
	public static long elapsedTime(long start) {
		long end = System.currentTimeMillis();
		return end - start;
	}

	/**This method guess number in given range
	 * @param first -start of range
	 * @param last	-end number
	 */
	public static void findNumber(int first, int last) {
		int middle = (first + last) / 2;
		if (first < last) {
			System.out.println("Is your number between " + first + " and "
					+ middle + " [y/n]:");
			char choice = scanner.next().charAt(0);
			if (choice == 'y' || choice == 'Y') {
				findNumber(first, middle);

			} else {
				findNumber(middle + 1, last);
			}
		} else if (first == last) {
			System.out.println("Number is " + last);
		}
	}
	
	/**
	 * @param Compare
	 * @param arr
	 * @return sorted array This Method returns sorted array
	 */
	public static <T extends Comparable<T>> Compare[] mergeSort(
			Compare<T> arr[]) {

		Compare<T> firstArray[] = new Compare[arr.length / 2];
		Compare<T> secondArray[] = new Compare[arr.length - arr.length / 2];
		int j = 0;
		if (arr.length == 1) {
			return arr;
		}
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = new Compare();
			firstArray[i].value = arr[i].value;
		}

		for (int i = firstArray.length; i < arr.length; i++) {
			secondArray[j] = new Compare();
			secondArray[j].value = arr[i].value;
			j++;
		}

		firstArray = mergeSort(firstArray);
		secondArray = mergeSort(secondArray);

		Compare<T>[] returnArray = new Compare[arr.length];
		int firstIndex = 0, secondIndex = 0;
		for (int i = 0; i < returnArray.length; i++) {
			returnArray[i] = new Compare();
			if (secondIndex == secondArray.length) {
				returnArray[i] = firstArray[firstIndex];
				firstIndex++;
			} else if (firstIndex == firstArray.length) {
				returnArray[i] = secondArray[secondIndex];
				secondIndex++;
			} else if (firstArray[firstIndex].value
					.compareTo(secondArray[secondIndex].value) > 0) {
				returnArray[i] = secondArray[secondIndex];
				secondIndex++;
			} else {
				returnArray[i] = firstArray[firstIndex];
				firstIndex++;
			}
		}

		return returnArray;

	}
	/**This method read file into string array
	 * @param filePath
	 * @return -Returns string array of words from file
	 */ 
	public static String[] readFile(String filePath) {
		String words[] = {};
		ArrayList<String> lines = new ArrayList<String>();
		String line, temp[] = {};
		BufferedReader bufferedReader;
		FileReader file;
		int index = 0;
		try {
			file = new FileReader(filePath);
			bufferedReader = new BufferedReader(file);
			while ((line = bufferedReader.readLine()) != null) {
				temp = line.split(",|\\s");
				for (int i = 0; i < temp.length; i++) {
					lines.add(temp[i]);

				}
			}
			words = lines.toArray(new String[lines.size()]);
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return words;
	}

	/** This method appends word on filePath
	 * @param word
	 * @param filePath
	 *           
	 */
	public static void appendFile(String word, String filePath) {

		try {
			FileWriter writer = new FileWriter(filePath, true);
			PrintWriter out = new PrintWriter(writer);
			out.println(word);
			out.close();
			writer.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**This method write given string on given filePath
	 * @param word     -Array of String to write
	 * @param filePath -File path with file name
	 */
	public static void writeFile(String word[], String filePath) {

		try {
			FileWriter writer = new FileWriter(filePath, false);
			PrintWriter out = new PrintWriter(writer);
			for (int i = 0; i < word.length; i++) {
				out.write(word[i] + " ");
			}
			out.close();
			writer.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**This method calculates minimum note to return given change
	 * @param noteCounts -holds note count
	 * @param change     -change to return
	 * @param pos		 
	 */
	public static void returnNotes(int noteCounts[], int change, int pos) {
		int notes[] = { 1000, 500, 100, 50, 10, 2, 1 };
		if (pos < notes.length) {
			if (change < notes[pos]) {
				returnNotes(noteCounts, change, ++pos);
			} else {
				change = change - notes[pos];
				noteCounts[pos]++;
				returnNotes(noteCounts, change, pos);
			}
		}
	}


	
}
