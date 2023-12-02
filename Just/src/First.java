
public interface First {

	void display();
}
interface Second{
	
	void print();
}

class End implements First,Second{

	public void display() {
		System.out.println("its first");
	}


	public void print() {
		System.out.println("its second");
	}
	
	public static void main(String[] args) {
		End e=new End();
		e.display();
		e.print();
	}
}