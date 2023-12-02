import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class IfSample2 {
	
	
	
	
	IfSample2(){
		
		
	}

	public static void main(String ar[]) {
		
		Scanner c=new Scanner(System.in);
	
		
		System.out.println("enter two numbers");
		
		int a=c.nextInt();
		int b=c.nextInt();
		
		if(a<b) {
			System.out.println("bigger is"+b);
		}else {
			System.out.println("bigger is "+ a);
		}
		
		System.out.println(" enter a numer");
		int num=c.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("sum is"+ sum);
	}
}
