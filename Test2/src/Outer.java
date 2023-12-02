
public class Outer  {

	void display() {
		Inner in= new Inner();
		in.show();
	}
	private class Inner{
		void show() {
			System.out.println(" h5i");
		}
	}
}

class Main{
	public static void main(String[] args) {
		
		Outer ot =new Outer();
		ot.display();
		
	}
}