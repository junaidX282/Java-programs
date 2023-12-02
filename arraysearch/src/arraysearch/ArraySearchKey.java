package arraysearch;

import java.util.Scanner;

public class ArraySearchKey {
	
	public static void main(String ar[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int size=sc.nextInt();
		System.out.println("enter array values:");
		int values[]=new int[size];
		int i,flag=0;
		for(i=0;i<size;i++) {
			values[i]=sc.nextInt();
		}
		System.out.println("enter search key:");
		int searchkey=sc.nextInt();
		for(i=0;i<size;i++) {
			if(searchkey==values[i]) {
				flag=1;
				break;
				
			}
			
		}
		if(flag==1) {
			System.out.println("position is"+(i+1));
		}
		else {
			System.out.println("not found value");
		}
		
	}	
		
}	





	


