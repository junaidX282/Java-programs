
class A{
	static int count=0;
	void display(int a) {
		count++;
		
		if(count<=a) {
			System.out.println(" hi"+count);
		
		
		
		}
	}
}

class Main{
	
	public static void main(String[] args) {
		A obj=new A();
		obj.display(6);
	}
}



