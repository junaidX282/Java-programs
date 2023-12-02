import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int []arr=new int[10];
		
		System.out.println("enter array size:");
		int size=s.nextInt();
		System.out.println("enter array values:");
		for(int i=0;i<size;i++) {
			 arr[i]=s.nextInt();
			}
		for(int i=0;i<size;i++) {
			 System.out.println(arr[i]);
			}
	}
}
