import java.util.Scanner;

public class Myclass extends Area {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r,choice;
		
		Area cir=new Area();
		Area sq=new Area();
		Area rect=new Area();
		Area triangle=new Area();
		
		System.out.println("enter your choice:\n 1.circle\n 2.square\n 3.rectangle\n 4.triangle");
		choice=sc.nextInt();
		
		if(choice==1) {
				
		System.out.println("enter radius");
		r=sc.nextInt();
		
		cir.circle(r);
		
		}
		if(choice==2) {
			
			System.out.println("enter length");
			int length=sc.nextInt();
			
			sq.square(length);
		}
		
		if(choice==3) {
			
			System.out.println("enter length and width");
			int len=sc.nextInt();
			int w=sc.nextInt();
			
			rect.rectangle(len, w);
		}
		
		if(choice==4) {
			
			System.out.println("enter base and height");
			int base=sc.nextInt();
			int height=sc.nextInt();
			
			triangle.triangle(base, height);
		}
		
	}
}
