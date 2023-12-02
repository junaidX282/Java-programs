
public class SampleMethod {
	int a=10;
	A obj;
	void display(SampleMethod obj) {
		System.out.println(a+"display");
	}
	public SampleMethod(A obj) {
		this.obj=obj;
		
	}
	
	void sample() {
		display(this);
	}
	public static void main(String[] args) {
		//SampleMethod s=new SampleMethod();
		//s.sample();
		A z=new A();
	}
	
}
class A{
	int a=20;
	int b=90;
	A(){
	SampleMethod s=new SampleMethod(this);
	System.out.println(this.b);
	}
}
