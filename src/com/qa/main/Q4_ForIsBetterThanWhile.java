package com.qa.main;

public class Q4_ForIsBetterThanWhile {
	void PrintA(){
		for (int A=100;A <= 200;A++) {
			System.out.println(A);
		}
	}
	
	
	void appendix() {
		for (int A=100  ; A<201 ; A++ ) {
			if (A%2==0) {
				System.out.println("-");
			}
			else {
				System.out.println("*");
			}
			//System.out.println(A); can include to check even numbers are dashes, and code is working correctly, which it is.
		}	
	}
}
