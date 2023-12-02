package basic;

public class AccessProtected {

	
//	public AccessProtected() {
//		System.out.println("base constructor");
//	}
	AccessProtected(int c){
		System.out.println("base arg ");
	}
}
class R extends AccessProtected{
	int a;

//	R(){
//		System.out.println("sub");
//	}
	R(){
		
		super(7);
		System.out.println("base arg constructor");
	}
	
	 void demo(F obj) {
		
	}
	void display() {
		//demo(this);
	}
	
}
class F{
	
	void jhjk()
	{
		R obj = new R();
		obj.demo(this);
	}
	
	
	
	
	void sum() {
		this.jhjk();
	}
	public static void main(String[] args) {
		
		
		
	R obj = new R();
	
	///F.demo(this);
	}
}


class P{
	int a;
	P(int r){
		a=r;
	}
	P( P obj){
		 a=obj.a;
	}
	
	public static void main(String[] args) {
		P obj1 = new P(8);
		P obj2 = new P(obj1);
		
		System.out.println(obj1.a);
	}
}



