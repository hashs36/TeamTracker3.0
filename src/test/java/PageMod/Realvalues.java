package PageMod;

import java.util.Scanner;

public class Realvalues {
public static void main(String[] args) {
	int n,m;
	float p, incr;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter lower value");
	n=sc.nextInt();
	
	System.out.println("Enter higher value");
	m=sc.nextInt();
	System.out.println("Enter increment value");
	incr=sc.nextFloat();
	
	for (float i=n; i<=m;i=i+incr) {
		System.out.println("values of defined inerval real values are"+i);
		
	}
}
}
