import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num,flag=0;
		System.out.println("enter a number");
		 num=sc.nextInt();
		for(int i=2;i<num-1;i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println(num+"is not"
					+ " prime");
		}
		else {
			System.out.println(num+" prime");
		}
		
	}
}
