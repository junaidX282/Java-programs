
public class Sample {

	public void display() {
		System.out.println("display super");
	}
	
}
class B extends Sample{
	
	public void display() {
		super.display();
		System.out.println(" display base");
		
	}
}
class Main{
	
	public static void main(String[] args) {
		
		Sample s= new B();
		s.display();
	}
}