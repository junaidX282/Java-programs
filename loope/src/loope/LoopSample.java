package loope;

import java.util.Scanner;

public class LoopSample {
	
	
public static void main(String[] args) {
		int h=1;
		for(int i=1;i<=9;i++) {
			
			for(int j=1;j<=9;j++) {
				
					if(i==1 || i==9 || j==i||j+i==10) {
						System.out.print("$");
					}
					else {
						System.out.print(" ");
					}
			}
				System.out.println();
//				if(i<=4) {
//					h++;
//				}else {
//					h--;
//				}
		}
	}
}
