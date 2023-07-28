//WAJP TO FIND IF THE GIVEN NUMBER IS PERFECT
package com.jsp.variables;
import java.util.Scanner;

public class PerfectNo {

    public static void main(String args[]) {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter a number");
    	int n = sc.nextInt();
    	int m=n; int sum=0;int i;
    	for(i=1;i<n;i++) {
    		if(n%i==0) {
    			sum = sum+i;
    			}
    	}
    		if(sum==n) {
        System.out.println(n+" is a perfect no");
    		}else {
    		System.out.println(n+" is not a perfect no");
    		}
	}
}
