//WAJP TO FIND IF THE GIVEN NUMBER IS STRONG NUMBER(EG 145)
package com.jsp.variables;
import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	int m=n; int s; int sum=0;
	while(n>0) {
		int fact=1;
		s = n%10;
		for(int i=1;i<=s;i++) { 
			fact=fact*i;
		}
		sum=sum+fact;
		n=n/10;
	}
	if(sum==m) {
		System.out.println("Given number is strong");
	}else {
		System.out.println("Given number is not strong");
	}
 }
}