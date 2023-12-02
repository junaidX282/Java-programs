package functiontest;

import java.util.Scanner;

public class FunctionSample {
	
	public static void main(String ar[]){
		
		Scanner j=new Scanner(System.in);
		
		System.out.print("enter two numbers:");
		
		int num1=j.nextInt();
		int num2=j.nextInt();
		
		int result=sum(num1,num2);
		System.out.print(""+result);		
	}
	
	
	static int sum(int a,int b) {
		int c=a+b;
		return c;
	}

}
