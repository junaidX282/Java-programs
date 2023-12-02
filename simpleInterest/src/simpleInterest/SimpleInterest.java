package simpleInterest;

import java.util.Scanner;

public class SimpleInterest {
	
	public static void main(String ar[]) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter principal amount");
		int p=sc.nextInt();
		
		System.out.println("enter interst rate");
		
		float r=sc.nextInt();
		
		System.out.println("enter number of years");

		float n=sc.nextInt();
		float si=(p*r*n)/100;
		System.out.println("simple interest is:"+si);
		
		
	}

}
