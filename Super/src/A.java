
public class A {

	int a=30;
	A(){
		System.out.println(" dg");
	}
	void display() {
		System.out.println("first class");
	}
	
	A(int a){
		System.out.println("argument A constructor");
	}
	public static void main(String[] args) {
		A a=new A(7);
			
		
	}
}
