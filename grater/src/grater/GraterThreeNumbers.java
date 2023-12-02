package grater;

import java.util.Scanner;

public class GraterThreeNumbers {
	
	public static void main(String ar[]){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter three numbers");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c){
			System.out.println("grater is "+a);
		}
		else if(b>a && b>c) {
			System.out.println("grater is "+b);
		}
		else {
			System.out.println("grater is "+c);
		}
		
	}

}
