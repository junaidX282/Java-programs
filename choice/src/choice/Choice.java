package choice;

import java.util.Scanner;

public class Choice {
	
	public static void main(String ar[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("1.for addition\n 2.for substraction\n 3.for multiplication\n 4.for division\n Enter your choice");
		int choice=sc.nextInt();
		
		float result;
		if(choice==1) {
		  	result=a+b;
		  	System.out.println("result is:"+result);
		}
		else if(choice==2) {
			result=a-b;
			System.out.println("result is:"+result);
			
		} else if(choice==3) {
			result=a*b;
			System.out.println("result is:"+result);
		
		} else if(choice==4) {
			result=a/b;
			System.out.println("result is:"+result);
		
		}else {
			System.out.println("invalid choice");
		}
		
		
	}

}
