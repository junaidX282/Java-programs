
public class Basic1 {
	
	final int a;
	static int b;
	Basic1(){
		a=10;
		
	}
	
	protected void show() {
    	System.out.println("hi");
	}
}
 class H{
	 H(){
		 System.out.println("h");
	 }
	static void display() {
		System.out.println("display");
		Basic1 obj=new Basic1();
		obj.show();
	}
}
class Main5 extends H{
	
	Main5(int a){
		
		System.out.println("main");
	}
	
	public static void main(String[] args) {
		Main5 obj=new Main5(5);
		
	}	
}
