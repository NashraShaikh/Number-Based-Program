//WAP TO DISPLAY SUM OF EVEN NUMBERS AND PRODUCT OF ODD NUMBERS
package com.jsp.variables;
import java.util.Scanner;

public class OddEven {
	public static void main(String args[]) {
		int sum=0; int n; int i; int pro=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		
		if(n%2==0) {
			for(i=0;i<=n;i=i+2) {
		    sum=sum+i;	
			}
		System.out.println("sum of even Number Is " + sum);
		}else {
			for(i=1;i<=n;i=i+2) {
			pro = pro*i;
			}
			System.out.println("pro of odd Number Is " + pro);
		}
	}
}
