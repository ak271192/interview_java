package com.exceptionhandling;

public class NPEtest {
	
	public static void checkOddEvenLengthString(String str) {
		if(str.length()%2 == 0) {
			System.out.println("Even"); ;
		}
		else {
			System.out.println("Odd");;
					
		}
	}



public static void main(String[] args) {
	checkOddEvenLengthString(null);
}
}
