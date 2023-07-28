//WAJP TO CHECK IF THE GIVEN NUMBER IS SPECIAL(EG:59=5+9+5*9)
package com.jsp.variables;
import java.util.Scanner;

public class SpecialNumber {

		public void isSpecial(int n) {
			int m=n; int s; int sum=0;int pro=1;
			while(n>0) {
				s = n%10;
				sum=sum+s;
				pro=pro*s;
				n=n/10;
			}
			if( sum+pro==m) {
	           System.out.println("Given number is a special number");
			}else {
				System.out.println("Given number is not a special number");
			}
		}
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a number");
			int n = sc.nextInt();
            SpecialNumber a = new SpecialNumber();
            a.isSpecial(n);
		}

	}


