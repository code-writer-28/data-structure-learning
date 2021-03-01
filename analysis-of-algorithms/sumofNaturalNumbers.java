/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int number = sc.nextInt();
		System.out.println("Sum of first " + number + " natural numbers is " +sumOfNaturalNumbersfirst(number));
		System.out.println("Sum of first " + number + " natural numbers is " +sumOfNaturalNumbersSecond(number));
	}
	
	private static int sumOfNaturalNumbersfirst(int num){
	    int sum = 0;
	    for(int i = 1; i <= num; i++){
	        sum  = sum + i;
	    }
	    return sum;
	}
	
	private static int sumOfNaturalNumbersSecond(int num){
	    return ((num * (num + 1))/2);
	}
}


Solution :- 
	https://ide.geeksforgeeks.org/QfhMhxk0Qr

Answers :- 
	Sum of first 10 natural numbers is 55
	Sum of first 10 natural numbers is 55

