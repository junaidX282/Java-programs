import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Operations a=new Operations();
		Scanner sc=new Scanner(System.in);
		int num1,num2,choice,c;
		System.out.println("entr two numbers:");
		 num1=sc.nextInt();
		 num2=sc.nextInt();
		 
		 System.out.println(" 1.additon\n 2.substractio\n 3.multiplication\n 4.division\nenter your choice:");
		 choice=sc.nextInt();
		
		
		if(choice==1) {
			a.addition(num1,num2);
		}
		else if(choice==2){
			
				a.substraction(num1,num2);
		}
		else if(choice==3) {
			a.multiplication(choice,num1,num2);
			
		}
		else if(choice==4) {
			a.division(choice,num1,num2);
		}
		}
}
