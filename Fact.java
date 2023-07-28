package com.jsp.variables;
import java.util.Scanner;

public class Fact {
	
	public static void factor(int n) {
		int i, fact=1;
		for(i=1;i<=n;i++) {
			fact= fact*i;
		}
		System.out.println("Factorial of the given number is " + fact);
	}

	public static void main(String [] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number:");
	 int n = sc.nextInt();
	 factor(n);
  }

}