package sample;

import java.util.Scanner;

public class HelloSample {
	
	public static void main(String ar[]) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("hello man");
		int a=s.nextInt();
		int b=s.nextInt();
		
		int sum=a+b;
		
		System.out.println("sum is "+ sum);
		System.out.println(""+ b);
	}

}
