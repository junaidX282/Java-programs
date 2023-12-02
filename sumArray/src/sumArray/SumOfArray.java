package sumArray;

import java.util.Scanner;

public class SumOfArray {

	
	public static void main(String ar[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int size=sc.nextInt();
		System.out.println("enter array values:");
		int values[]=new int[size];
		int i,sum=0;
		for(i=0;i<size;i++) {
			values[i]=sc.nextInt();
		}
		for(i=0;i<size;i++) {
			sum=sum+values[i];
		}
		System.out.println("sum is :"+sum);
		
	}
}
