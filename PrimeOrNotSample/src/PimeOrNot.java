import java.util.Scanner;

public class PimeOrNot {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		int n=sc.nextInt();
		int flag=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) 
			 flag=1;
			break;
		
	}
		
		if(flag==0) 
			System.out.println("number is prime");
		else
		
			System.out.println("number not prime");
		
}
}
