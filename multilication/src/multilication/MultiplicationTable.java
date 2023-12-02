package multilication;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String ar[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		int n=sc.nextInt();
		int i,sum;
		for(i=1;i<=10;i++) {
			sum=i*n;
			System.out.println(i+"*"+n+"="+sum+"\n");
	
			
		}
	}

}
