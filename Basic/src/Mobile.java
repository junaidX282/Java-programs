
public class Mobile {

	
	String brand;
	int price;
	static String name;
	
	  public Mobile() 
	  { 
		 
	  
	     System.out.println(name="constructer"); 
	  }
	  
	  static
	  {  
		  System.out.println(name="static"); 
	  }
	  
		void show() 
		{
		System.out.println(brand+" : "+price+" : "+name);
		}
	
	static void show1(Mobile mob) 
	{
		System.out.println(mob.brand+" : "+mob.price+" : "+name);
	}
	
}
class Sample{
	
	
	public  void main(String[] args) {
		
		
		
		Mobile obj=new Mobile();
		
		obj.brand="apple";
		obj.price=1200;
		Mobile.name="smart phone";
		
		obj.show();
		
		Mobile obj2=new Mobile();
		
		obj2.brand="samsung";
		obj2.price=1300;
		Mobile.name="smart phone";
		
		
		obj2.show();
		Mobile.show1(obj);
	}
	
	
	
	
	
}