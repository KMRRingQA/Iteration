package com.qa.main;

public class Q2_Flowchart {
	void appendix() {
		int A = 100;
		do { 
		if (A%2==0) {
			System.out.println("-");
			A++;
		}
		else {
			System.out.println("*");
			A++;
		}
		//System.out.println(A); can use to check that all is working as intended, which it is
		} while (A <= 200);
		
	}
}
