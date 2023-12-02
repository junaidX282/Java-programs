
public class A {

	protected A() {
		
	}
	int a=10;
	void one() {
		System.out.println("one");
	}	
}

class B extends A {
	private B() {
		
	}
	int c=67;
	void one() {
		
		System.out.println("two");
	}
}

class C extends B {
	
	public static void main(String[] args) {
		C obj=new C();
		obj.one();
	}
}
class D extends B{
	public static void main(String[] args) {
		D obj1 = new D();
		obj1.one();
	}


}
	