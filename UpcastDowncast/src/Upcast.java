
public class Upcast {

	public void show1() {
		System.out.println("show 1");
	}
}

class B extends Upcast{
	
	public void show2() {
		System.out.println("show 2");
	}
}

class Main{
	public static void main(String[] args) {
		
		Upcast obj= new B();   //Upcast
		obj.show1();
		
		B obj1=(B)obj;// Down cast
		obj1.show2();
	}
}