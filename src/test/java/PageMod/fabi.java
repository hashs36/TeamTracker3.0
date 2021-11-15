/*
 * Print Fabinacii series of given number of values
 */
package PageMod;

import java.util.Scanner;

public class fabi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values required");
		int N = sc.nextInt();
		int num1=0,num2=1,num3=0,counter=1;
		while(counter<N) {
			if (counter == 1) 
				System.out.print(num1+" ");
			if (counter == 2) {
					System.out.print(num2+" ");
			} else 
			{num3=num1+num2;
			System.out.print(num3+"  ");
			num1=num2;
			num2=num3;
			}
			counter++;
		}
		
	}

}
