
public class Abc {

	void display() {
		System.out.println("object class");
	}
}


class X extends Abc{
	void display() {
		System.out.println("child class X");
	}
}


class Z extends X{
	void display() {
		super.display();
		System.out.println("Z class");
	}
}
class main{
	public static void main(String[] args) {
		
		Z obj = new Z();
		
		obj.display();
	}
}