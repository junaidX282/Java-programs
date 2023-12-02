

											//ANONYMOUS INNERCLASS
class A{
	
	public void show() {
		System.out.println("show super class");
	}
}

public class Sample {

	int a;
	
	public void display() {
		System.out.println("Anonymous ");
		//obj.show();
	}
	
	public void show() {
		
		System.out.println("show1");
	}
}
class Main{
	public static void main(String[] args) {
		
		A obj= new A();
		//obj.show();
		Sample s= new Sample() 
		{
			public void display() 
			{
				System.out.println("New Anonymous ");
			}
		};
	s.display();
		s.show();
	}
}