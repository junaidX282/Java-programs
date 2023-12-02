
public abstract class Just {
	
	 abstract void study();

	
}
class A {
	
	public static void main(String[] args) {
		
		Just obj=new Just() 
		{
			public void study() {
				System.out.println("new abs");
			}
		};
		obj.study();
	}

	
	
}
