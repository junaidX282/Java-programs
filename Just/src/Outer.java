
public class Outer {

	static int a=98;
	void display() {
		System.out.println("its outer class");

		Inner in =new Inner();
		
		
	}
class Inner{
	int b=45;
	void show() {
		System.out.println("its inner class"+a);
		display();
	}
}
}
class Main{
	public static void main(String[] args) {
		
		Outer ot=new Outer();
		Outer.Inner in=ot. new Inner();
		in.show();
		
		
		
	
	}
	
}