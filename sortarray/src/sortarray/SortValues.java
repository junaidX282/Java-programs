package sortarray;

import java.util.Scanner;

public class SortValues {
	
	public static void main(String ar[]) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter array size:");
		int size=sc.nextInt();
		int limit[]=new int[size];
		
		System.out.println("enter the array values:");
		int i,j,temp;
		for(i=0;i<size;i++) {
			limit[i]=sc.nextInt();
		}
		for(i=0;i<size;i++) {
			for(j=i+1;j<size;j++) {
				if(limit[i]>limit[j]) {
					temp=limit[i];
					limit[i]=limit[j];
					limit[j]=temp;
					
				}
				
			}
		}
		System.out.println("sort is:");
		for(i=0;i<size;i++) {
			System.out.println(""+limit[i]);
		}
		
	}

}
