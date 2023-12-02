package twoimensionarray;

import java.util.Scanner;

public class TwoDimensionalArray {
	
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter aray size");
		int size=sc.nextInt();
		System.out.println("enter array 1 values:");
		int values[][]=new int[size][size];
		int i,j;
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				values[i][j]=sc.nextInt();
			}
				
		}
		System.out.println("enter array 2 values:");
		int values2[][]=new int[size][size];
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				values2[i][j]=sc.nextInt();
			}
				
		}
		int temp[][]=new int[size][size];
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				temp[i][j]=values[i][j]+values2[i][j];
			}
		}
		System.out.println("sum is:");
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				System.out.print(+temp[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}

}
