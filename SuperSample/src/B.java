
public class B extends A{

	int a;
	
	B(){
		System.out.println("this is constructer B");
	}
	
	B(int a){
		super(34);
		super.a=20;
		System.out.println("this is argumnt constructer B");
		System.out.println(a);System.out.println(super.a);
	}
	
		
	
	void display() {
		System.out.println("this is class B");
		super.display();
		a=10;
		
		
		
	}
	
	public static void main(String[] args) {
		
		B b=new B(10);
		/*b.display();
		*/
		b.a=9;		String junu="junaid";
		System.out.println(junu);
	}
}

