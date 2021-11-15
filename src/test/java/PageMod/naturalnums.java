package PageMod;

import java.util.Scanner;

public class naturalnums {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number to print number of  nutural numbers");
		int N= sc.nextInt();
		
		for (int i=0;i<=N;i++) {
			
			System.out.print(i+" ");
		}

	}

}
