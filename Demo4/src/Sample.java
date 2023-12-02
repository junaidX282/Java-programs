
interface Sample {
	void display();
	
}
interface A{
	
	
	void view();
		
	
}
class B{
	void Sample() {
	 int a=10;
	}
}
class Main implements A,Sample{	
	public static void main(String[] args) {
		
		Main obj=new Main();
		obj.display();
		obj.view();	
		System.out.println(1111);
	}

	
	public void display() {
		System.out.println("first");
		
	}

	
	public void view() {
		System.out.println("second");
		
	}
}
