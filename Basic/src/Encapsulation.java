
public class Encapsulation {

	private int a;
	private String b ="junu";


	public int pick() {
		return a;
	}
	
	public String Name() {
		return b;
	}
	
	public void readNum(int c) {
		 a=c;
	}

}
class Hey{
	
	public static void main(String[] args) {
		
		Encapsulation obj=new Encapsulation();
		
		obj.readNum(4);
		
		System.out.println(obj.pick());
		System.out.println(obj.Name());
		
	}
}