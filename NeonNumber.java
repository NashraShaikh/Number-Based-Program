//WAJP TO RETURN TRUE IF THE GIVEN NUMBER IS NEON(EG 9=9*9=81 8+1=9)
package com.jsp.variables;
import java.util.Scanner;

public class NeonNumber {

	public boolean isNeon(int n) {
		int s; int sum=0;int m=n; n = n*n;
		while(n>0) {
			s = n%10;
			sum=sum+s;
			n=n/10;
		}
		if( sum==m) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		NeonNumber n1 = new NeonNumber();
	    boolean a = n1.isNeon(n);
		System.out.println(a);
	}
}
