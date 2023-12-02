package bismi;

public class Outer {
	int a=20;
	
	class Inn{
		int b;
		void in() {
			System.out.println("in class");
		}
	}
	
	  void display() {
		System.out.println("outer");
		Inn i=new Inn();
		i.in();
		
	}
	 
	 
class Inner{
	public static void main(String[] args) {
		Outer o=new Outer();
		o.display();
	}
	
	}
	
}

