package encapsulation;

public class Sampl {

	public static void main(String[] args) {
		
		Test t=new Test();
		t.setB(10);
		System.out.println(t.getB());
		t.setName("junu");
		System.out.println(t.getName());
	}
}
