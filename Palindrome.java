//WAJP TO CHECK IF THE GIVEN NUMBER IS PALINDROME
package com.jsp.variables;
import java.util.Scanner;

public class Palindrome {

	public static void isPalindrome(int n) {
		int m=n; int last_digit; int rev=0;
		while(n>0) {
			last_digit = n%10;
			rev=rev*10+last_digit;
			n=n/10;
		}
		if( m==rev) {
			System.out.println("Given number is palindrome");
		}else {
			System.out.println("Given number is not palindrome");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		isPalindrome(n);
		
	}

}
