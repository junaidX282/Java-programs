
public class A {

	 private A(){
		System.out.println("non argument constructor");
	}
	A(int a){
		System.out.println("argument constructor");
	}
}
class Fbc extends A{
	
	 Fbc(){
		super(6);
		System.out.println("b normal");
		
	}
	
	
	B obj =new B();
}