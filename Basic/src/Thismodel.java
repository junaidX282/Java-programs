
public class Thismodel {

	int a;
	
	Thismodel(){
		this(7);
		System.out.println("super");
	}
	Thismodel(int b)
	{
		
		System.out.println("int super");
	}
}
class Second extends Thismodel{
	
	Second(){
		this(45);
		System.out.println("in sec");
	}
	
	Second(int a){
		
		System.out.println("int sec");
		
	}
}


class Sam{
	public static void main(String[] args) {
		
		Second obj=new Second(); 
	}
	
	
	
}