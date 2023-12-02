package new1;

public class Outer {

	int a=40;
	void display() {
		System.out.println("outer class");
	}
}


class B{
	public static void main(String[] args) {
		
		Outer o=new Outer();
		o.display();
	}
}