package copyConstructor;

class Copy {
 
	int b=40;
	final int a;
	Copy(){
		a=20;
	}
	
	 void sample(Copy obj) {
		 obj.b=100;
	 }
}
class C  {
	public static void main(String[] args) {
		Copy c=new Copy();
		//int b=c.sample(1);
		System.out.println(c.b);
	
		c.sample(c);
		System.out.println(c.b);
	}
	
	
}