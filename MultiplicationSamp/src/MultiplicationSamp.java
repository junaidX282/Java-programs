import java.util.Scanner;

public class MultiplicationSamp {

	public static void main(String ar[]) {
		
		Scanner ab=new Scanner(System.in);
		
		System.out.print("enter a number");
		
		int num=ab.nextInt();
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum=i*num;
			System.out.print(i+"*"+num+"="+sum+"\n");
			
				
		}
	}
}
