//WAJP TO FIND IF THE GIVEN NUMBER IS ARMSTRONG
package com.jsp.variables;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void isArmstrong(int n) {
		int m=n; int s; int rev=0;
		while(n>0) {
			s = n%10;
			rev=s*s*s+rev;
			n=n/10;
		}
		if( m==rev) {
			System.out.println("Given number is Armstrong");
		}else {
			System.out.println("Given number is not Armstrong");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		isArmstrong(n);
		
	}

}
