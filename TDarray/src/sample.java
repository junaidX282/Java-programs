import java.util.Scanner;

public class sample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int c;
		int[][]arr=new int[5][5];
		
		
		c=getarray(arr);
		displayarray(arr,c);
	
	}

	
	static int getarray(int b[][]) {
		Scanner sc=new Scanner(System.in);
		int i,j,size;
		System.out.println("enter array size:");
		size=sc.nextInt();
		System.out.println("enter array values:");
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		return size;
	}
	
	
	static void displayarray(int b[][],int size) {
		int i,j;
		System.out.println("array values are");
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				System.out.print(b[i][j]+" ");
			}System.out.println();
		}
	}
	
	
	
	
}