
public class Area {

	float n=2;
	double p=3.14;
	double result;
	
	void circle(int r){
		
		 result=p*r*r;
		 System.out.println("area is "+result);
	}
	
	void square(int length) {
		result=length*length;
		System.out.println("area is "+result);
	}
	
	void rectangle(int len,int width) {
		result=len*width;
		System.out.println("area is "+result);			
	}
	
	void triangle(int base,int height) {
		
		result=0.5*(base*height);
		System.out.println("area is "+result);
	}
}
