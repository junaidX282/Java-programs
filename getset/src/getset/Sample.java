package getset;

public class Sample {

	String town="tirur";
	int num;
	
	private void display() {
		System.out.println("junu");
	}
	
	
	
	
	
}
class main{
	
	public static void main(String[] args) {
		Sample s=new Sample();
		
		s.town=("vailathur");
		System.out.println(s.town);
		
	}
}