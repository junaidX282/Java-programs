package interface2;

interface Sample {

	int a=10;
	String b="junu";

	void Display();
}
class B implements Sample{


	public void Display() {
		System.out.println(" sub class");
	}
}

class Main{
	public static void main(String[] args) {
		Sample obj;
		obj=new B();
		obj.Display();
		System.out.println(obj.a);
	}
}