import java.util.Scanner;

public class SampleArray {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		String we=sc.next();
		
		
		
		System.out.println("enter array row size:");
		int n=sc.nextInt();
		
		System.out.println("enter array coloumn size:");
		int m=sc.nextInt();
		
		int[][]values=new int[n][m];
		System.out.println("enter the elements:");
		
					int j;
					for(int i=0;i<n;i++) {
						for(j=0;j<m;j++) {
						values[i][j]=sc.nextInt();
						
		}
	}
		System.out.println("array values are:");
		
					for(int i=0;i<n;i++) {
						for(j=0;j<m;j++) {
						System.out.print(values[i][j]+" ");
	
		}
			System.out.println();
	}
  }
}
