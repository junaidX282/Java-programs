package forloop;

import java.util.Scanner;

public class ForLoop {
	
	public static void  main(String ar[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		
		int num=sc.nextInt();
		
		int i,sum=0;
		
		for(i=0;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("sum is:"+sum);
	}

}
