
public class Demo {

	int a;
	
	public Demo() {
		System.out.println("just fun");
	}
	
	void show()
	{
		System.out.println("method");
	}
	
	public void sum()
	{
		System.out.println("sum");
	}
}

class Sample1{
	
		public static void main(String[] args) {
		
		new Demo().show();
		new Demo().sum();
	}
}