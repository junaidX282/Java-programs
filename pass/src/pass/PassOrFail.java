package pass;

import java.util.Scanner;

public class PassOrFail {
	
	public static void main(String ar[]) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your mark:");
    int mark=sc.nextInt();
    if(mark>=50) {
    	System.out.println("you pass");
    }
    else {
    	System.out.println("you fail");

    }
    
	}
    
	
	
    

}
