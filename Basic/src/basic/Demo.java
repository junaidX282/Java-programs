package basic;

import java.io.IOException;
import java.util.Scanner;

public class Demo {

	
	public static void main(String[] args) {
		
		int i=10,j=0,k=0;
		int a[]=new int[4];
		try {
			System.out.println(i/4);
			Scanner sc = new Scanner(System.in);
			int b=sc.nextInt();
				for( i=0;i<=4;i++) {
					int t=10/0;
				}
			
		
		}
			catch (ArrayIndexOutOfBoundsException ec) {
				System.out.println("index not found");
			}
			
			
		catch (Exception e) {
			
			System.out.println(" unknown exeption");
		}
	
		
		
		System.out.println(k);
		
	}
}
