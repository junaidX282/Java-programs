package samlble;

public class Hello {
	
	public static void main(String a[]) {
	
		Sample s1=new Sample();
		Sample s2=new Sample();
		
		s1.a=10;
		s2.a=20;
		s1.b=30;
		s2.b=40;
		
		System.out.println("s1 a="   +s1.a+   "  s2.a=" +s2.a+   "  s1.b=" +s1.b+  "  s2.a=" +s2.b);
	}

}
