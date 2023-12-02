package new1;

public class Main {

	int a;
	Main(){
		System.out.println("junu"+a);
	}
	
	{a=10;}
	{System.out.println(" main instance initializer");}
	
	 Main(int a){
		System.out.println(a);
	}

	
	public static void main(String[] args) {
		A a=new A();
	}
}

class A extends Main{
	
	A(){
		super();
		System.out.println(" A contructor");
	}
	{System.out.println("nstance initialaizer");}
	
}