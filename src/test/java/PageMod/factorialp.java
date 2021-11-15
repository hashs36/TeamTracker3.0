/*
 * Print factorial value of given number and all factorial values from 1 to given number
 */

package PageMod;

import java.util.Scanner;

public class factorialp {

	public static void main(String[] args) {
		int n1=1,n2=0,n3=0,fact=1,n=0,i;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number to calculate factorial");
		n=sc.nextInt();
		for (i=1;i<=n;i++) {
			fact=fact*i;
			System.out.println(fact);
		}
		System.out.println(fact);
		
	

	}

}
