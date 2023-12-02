
 class A {
	 int a=89;
	 void display() {
		System.out.println("hi guyzz");
	}
}class B extends A{
	
	 void display() {
		 System.out.println("sub class method");
	 }
	 public static void main(String[] args) {
		
		 B obj=new B();
		 B obj1 =new B();
		 obj.display();
		 System.out.println(obj1.a);
		 
	}
	 
}