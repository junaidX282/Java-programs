package objsample;

public class Hi {

	public static void main(String[] args) {
		
		Local a=new Local();
		Local b=new Local();
		Local c=new Local();
		
		a.a=9;
		b.a=8;
		
		a.b=7;
		b.b=6;
		
		c.a=4;
		c.b=0;
		
		
		a.display();
		
		
		c.display();
		
	}
}
