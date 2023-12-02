package oneTwoThree;

import java.util.Scanner;

public class OneTwoThreePrint {
	
	public static void main(String ar[]) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number");
		int limit=sc.nextInt();
		int i,j;
		for(i=1;i<=limit;i++) {
			for(j=limit;j>i;j--) {
				System.out.println(""+j);
			}
			System.out.println("\n");
		}
	}

}
