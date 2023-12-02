import java.util.Scanner;

public abstract class Demo implements C {
	
	 abstract void display();

	public Demo() {
		System.out.println("hi bro");
	}
		
	void sample() {
		System.out.println("sample non-abstract method");
	}
	 static void method() {
		 System.out.println("static method");
	 }	
}
interface C{
	
	  void demo();
	
	 
	 static void demo(int a) {
		 System.out.println(a);
	 }
		
	
}
class A extends Demo implements C{

	
	public void display() {
		System.out.println("abstract method");
	}
	
		
	
	public static void main(String[] args) {
		
		Scanner obj1 =new Scanner(System.in);
		
		A obj = new A();
		obj.display();
		Demo.method();
		C.demo(4);
	}



	@Override
	public void demo() {
		// TODO Auto-generated method stub
		
	}
	
}