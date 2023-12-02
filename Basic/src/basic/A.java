package basic;

public class A {

	final int a;
	
	A(){
		a=78;
		final int c;
	}
	final void run() {
		
	}
}
class B extends A{
	
	
	public static void main(String[] args) {
		B obj = new B();
		obj.run();
	}
	
}