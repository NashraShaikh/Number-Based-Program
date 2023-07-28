//WAJP TO RETURN TRUE IF THE NUMBER IS SPY NUMBER(EG:123)
package com.jsp.variables;
import java.util.Scanner;

public class SpyNumber {
	
	public static boolean isSpy(int n) {
		int s; int sum=0;int pro=1;
		while(n>0) {
			s = n%10;
			sum=sum+s;
			pro=pro*s;
			n=n/10;
		}
		if( sum==pro) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		boolean a = isSpy(n);
		System.out.println(a);
	}
}