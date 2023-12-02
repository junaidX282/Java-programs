package primeor;

import java.util.Scanner;

public class PrimeOrNot {
	
	public static void main(String ar[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int i,flag=0;
		for(i=2;i<num;i++) {
			
			if(num%i==0) {
				flag=1;
				break;
			}
		   
		}
	     if(flag==0) {
			 System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");
		}
		
	}

}
