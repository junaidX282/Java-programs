
public class Sample {

	Sample(){
		System.out.println("constructor");
	}
	
	Sample(int a){
		System.out.println("Argument constructor");
	}
}
class Main{
	public static void main(String[] args) {
		Sample s=new Sample();
	}
}