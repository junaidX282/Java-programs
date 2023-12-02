package arrayswap;

import java.util.Scanner;

public class ArraySwaping {
	
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int size=sc.nextInt();
		System.out.println("enter array values:");
		int i;
		int values[]=new int[size];
		for(i=0;i<size;i++) {
		 values[i]=sc.nextInt();
			
		}
		System.out.println("enter second array values:");
		int second[]=new int[size];
		for(i=0;i<size;i++) {
			second[i]=sc.nextInt();
		}
		System.out.println("after swapping values:");
		int temp[]=new int[size];
		for(i=0;i<size;i++) {
			temp[i]=values[i];
			values[i]=second[i];
			second[i]=temp[i];
		}
		System.out.println("array 1 values:");
		for(i=0;i<size;i++) {
			System.out.println(""+values[i]);
		}
		System.out.println("array 2 values:");
		for(i=0;i<size;i++) {
			System.out.println(""+second[i]);
		}
		
	}

}
