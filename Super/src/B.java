
public class B extends A{

	int a=50;
	
	B(int a){
		super(6);
		System.out.println("argument B constructor");
	}
	B(){
		
		
	}
	void display() {
		
		System.out.println("Class B");
		a=40;
		
	}
	void base() {
		super.display();
		System.out.println(super.a);
	}
	
	
	public static void main(String[] args) {
		
		B s=new B();
		
		
		//s.display();
		//s.base();
	}
}
