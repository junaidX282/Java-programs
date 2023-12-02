
public class Samplemodel {
	
	String model;
	String modelname;
	int price;

	public static void main(String[] args) {
		
		Samplemodel p1=new Samplemodel();
		Samplemodel p2=new Samplemodel();
		Samplemodel p3=new Samplemodel();
		
		
		p1.model="apple";
		p1.modelname="apple 10";
		p1.price=90000;
		
		System.out.println(p1.model+" "+p1.modelname+" "+p1.price);
		

		p2.model="mi";
		p2.modelname="poco";
		p2.price=24000;
		
		System.out.println(p2.model+" "+p2.modelname+" "+p2.price);
	}
	
	
}
