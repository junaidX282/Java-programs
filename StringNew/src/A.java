import java.util.Scanner;

public class A {

	
	public static void main(String[] args) {
		
		String ae="junu";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a name");
		String ab=sc.nextLine();
		System.out.println("ur name is:"+ab);
		System.out.println("enter a number");
		int n=sc.nextInt();
		for(int i=0;i<=n;i=i+10) {
			System.out.println(i);
			
		}
	}
}
