
public class staiti {

	static void demo() {
		System.out.println("hi");
	}
}
class Dfg extends staiti{
	
	static void demo() {
		System.out.println("hello");
		
	}
	public static void main(String[] args) {
		
		Dfg obj =new Dfg();
		obj.demo();
		demo();
	}
}
class F{
	Dfg obj1 = new Dfg();
	public static void main(String[] args) {
		
	}
}