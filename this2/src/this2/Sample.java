package this2;

public class Sample {

	void display() {
		System.out.println("display");
	}
	
	void dislay1() {
		
		System.out.println("1");
		this.display();
	}
	
	Sample(){
		
		System.out.println(" no argument");
	}
	Sample(int e){
		
		System.out.println("argument");
		
	}
	
	public static void main(String[] args) {
		Sample s=new Sample();
		//s.dislay1();
		
		
	}
}
