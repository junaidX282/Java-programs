package staticf;

public class SampleStatic {
	
  static int a=10;
  int c=89;
	 void display() {
		System.out.println("good morning"+c);
	}
	
	public static void main(String[] args) {
		SampleStatic s=new SampleStatic();
		s.a=49;
		
		s.c=88;
		int b=9;
		
		s.display();
		
	 
			SampleStatic s2=new SampleStatic();
			System.out.println("s2 "+s2.c);
			System.out.println(s.c);
			SampleStatic s3=new SampleStatic();
			s3.c=47;
			System.out.println(s3.c);
	}
	
	 
}
