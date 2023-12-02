
public interface Demo {

	void show();
}

	interface E extends Demo{
		void display();
	}

class C implements Demo{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
//
//	@Override
//	public void display() {
//		// TODO Auto-generated method stub
//		
//	}


}
class D extends C implements B{
	public void display() {
		
		
	}
	
}