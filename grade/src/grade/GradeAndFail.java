package grade;

import java.util.Scanner;

public class GradeAndFail {
	
	public static void main(String ar[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your total mark percentage");
		int tp=sc.nextInt();
		System.out.println("MARK     GRADE\n <90      A\n 80-89     B\n 70-79     C\n 60-69     D\n 50-59     E\n <50     failed    ");
		if(tp>=90) {
			System.out.println("your grade is A");
			
		}
		else if(tp>=80) {
			System.out.println("your grade is B");
		}
		else if(tp>=70) {
			System.out.println("your grade is C");
		}
		else if(tp>=60) {
			System.out.println("your grade is D");
		}
		else if(tp>=50) {
			System.out.println("your grade is E");
		}
		else if(tp<=50) {
			System.out.println("you fail");
		}
	}

}
