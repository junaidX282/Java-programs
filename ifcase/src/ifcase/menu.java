package ifcase;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Operation ab=new Operation();
		
		System.out.println(" enter two numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(" 1.for addition\n 2.for substraction\n 3.for multiplication\n 4.for division\n enter your choice:");
		int choice=sc.nextInt();
		
		if(choice==1) {
			ab.addition(num1,num2);
			 
			
			 
		}else if(choice==2) {
			ab.substraction(num1,num2);
				 
				
			
			
		}
		else if(choice==3) {
			
			ab.multiplication(num1,num2);
			 		
			
			
			 
		}
		else if(choice==4) {
			ab.division(num1,num2);
			 
		}
		 
	}
}
