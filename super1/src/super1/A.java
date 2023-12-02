package super1;

public class A extends main {
	
	A(){
		System.out.println(" A constructor");
	}
	
	A(int a){
		super(7);
		System.out.println("A argument Constructer");
	}
	
	
	
	
	
	
	

	void display() {
		
		System.out.println("Class A function");
		super.display();
	}
	
	
	
	
	
	public static void main(String[] args) {
		A a=new A(8);
		//a.display();
	}
}
