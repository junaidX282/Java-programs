import java.util.Scanner;

public class Array { 
	
public static void main(String[] args) {
	
	
	
	
	int i,j,l,n=4;
	
	for(i=1;i<=n;i++) {
		if(i%2==0) {
			l=3;
		}
		else {
			l=1;
		}
		for(j=1;j<=l;j++) {
			System.out.println("*");
		}
		for(j=1;j<=n*i;j++) {
			if(i==4) {
				break;
			}
			System.out.print("*");
		}System.out.println();
	}System.out.println();
	
	for(i=1;i<=4;i++) {
		for(j=0;j<=i;j++) {
			System.out.print("* ");
		}System.out.println();
		
		for(j=1;j<=i;j++) {
			if(i==4)
				break;
			
			System.out.println("*");
		}
	}System.out.println();
	
	for(i=1;i<=3;i++) {
		for(j=1;j<=6*i;j++) {
			System.out.print("* ");
			if(j==i*3) {
				System.out.println();
				
			}
			
		}System.out.println();
		for(j=1;j<=4*i;j++) {
			if(i==3)
				break;
			System.out.print("* ");
		}System.out.println();
	}
	
	
	for(i=1;i<=5;i++) {
		for(j=1;j<=5;j++) {
			System.out.print("*");
		}System.out.println();
	}
	
	
}
}
