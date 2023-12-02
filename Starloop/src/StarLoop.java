import java.util.Scanner;

public class StarLoop {

	public static void main(String ar[]) {
	
		
	Scanner b=new Scanner(System.in);
	
	System.out.print("enter a number");
	int limit=b.nextInt();
	int i,j;
	
	for(i=1;i<limit;i++) {
		for(j=i;j<limit;j++) {
			System.out.print("*");
			
		}
		System.out.print("\n");
	}
	}
}
