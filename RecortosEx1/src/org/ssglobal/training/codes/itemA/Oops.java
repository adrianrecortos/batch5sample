package org.ssglobal.training.codes.itemA;

public class Oops {
	
	public static int a = 7;
	public static int b = 42;
	public static int smaller = minimum(a, b); 

	public static void main(String[] args) {
		 if (smaller == a) { 
		     System.out.println("a is the smallest!"); 
		 } else { 
			 System.out.println("b is the smallest!");
		 } 
	}
	
	public static int minimum(int a, int b) {  
		
		// returns which int is smaller   
		 if (a < b) { 
		 smaller = a; 
		 } else { 
		 smaller = b; 
		 } 
		return smaller; 
    }
}
