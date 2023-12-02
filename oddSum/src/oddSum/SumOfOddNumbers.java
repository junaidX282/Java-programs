package oddSum;

import java.util.Scanner;

public class SumOfOddNumbers {

	
	public static void main(String ar[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		int n=sc.nextInt();
		int i,sum=0;
		for(i=1;i<=n;i++) {
			if(i%2==1) {
				sum=sum+i;
			}
			
		}
		System.out.println("sum is:"+sum);
		
	}
}
