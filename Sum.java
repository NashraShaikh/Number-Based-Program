//SUM OF NATURAL NUMBERS // PRODUCT OF NATURAL NUMBER
package com.jsp.variables;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
    int n= sc.nextInt();
    int i; int sum=0;     //int pro=1;
    
    for(i=1;i<=n;i++) {
    	sum=sum+i;        //pro=pro*i;
    }
    System.out.println(sum);   //print(pro);
	}

}
