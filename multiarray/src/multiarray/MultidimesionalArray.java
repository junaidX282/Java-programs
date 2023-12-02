package multiarray;

import java.util.Scanner;

public class MultidimesionalArray {
	
	public static void main(String ar[]) {
		
		Scanner sc=new Scanner(System.in);
		int i,j;
		int a[][]=new int[3][3];
		System.out.println("enter array values:");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println(" array values:\n");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
		
			System.out.println("\t"+a[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}

}
