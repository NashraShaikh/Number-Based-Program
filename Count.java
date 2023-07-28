package com.jsp.variables;

import java.util.Scanner;

public class Count {
 public int count(int n) {
	 int count=0;
	 while(n>0) {
		 n=n/10;
		 count++;
	 }
	 return count;
 }
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number:");
		 int n = sc.nextInt();
         Count c =new Count();
         int digit= c.count(n);
         System.out.println("no of digit is " + digit);
	}

}
