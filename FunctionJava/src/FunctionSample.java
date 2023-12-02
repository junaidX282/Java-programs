import java.util.Scanner;

public class FunctionSample {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Sample a=new Sample();
		Sample b=new Sample();
		
		int num1=50;
		int num2=90;
		int num3=78;
		int num4=100;
		
		a.sum(num1,num2,num3);
		//a.display();
		
		
		b.sum(num3,num4,num4);
		//b.display();
		
		
		//b.display();
		
		
		System.out.println("enter two numbers");
		int d=70;
		int num=sc.nextInt();
		int nu=sc.nextInt();
		int result=sum(num,nu);
		System.out.println(result);
	}


	 static int sum(int d,int b) {
		int c=d+b;
		
		return c;
	}
}