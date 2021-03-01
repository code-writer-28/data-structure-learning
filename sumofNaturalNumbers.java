/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int number = sc.nextInt();
		System.out.println("Sum of first " + number + " natural numbers is " +sumOfNaturalNumbers(number));
	}
	
	private static int sumOfNaturalNumbers(int num){
	    int sum = 0;
	    for(int i = 0; i < num; i++){
	        sum  = sum + i;
	    }
	    return sum;
	}
}
