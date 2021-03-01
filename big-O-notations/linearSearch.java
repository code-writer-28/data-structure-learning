/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int arr [] = new int [num];
	    for(int i = 0; i < num; i++){
	        arr[i] = sc.nextInt();
	    }
	    int value = sc.nextInt();
	    
	    System.out.println(linearSearch(arr,num,value));
	}
	
	private static int linearSearch(int arr[], int num, int value){
	    for(int i = 0; i < num ; i++){
	        if(arr[i] == value)
	            return 0;
	    }
	    return -1;
	}
	
}


solution : - https://ide.geeksforgeeks.org/6l6NIj38eC

Order of Growth :- 
	f(n) = O(n).
