package Sample2;
	
	abstract class Model {
	
		abstract void tripAll();
		
		public void display() {
			System.out.println("thank u for visiting");
		}
	}

	class A extends Model{
		
		void tripAll() 
		{
			System.out.println("wayand");
	    }
	}
		
	class B extends Model{
		void tripAll() 
		{
			System.out.println("idukki");
	    }
	}
	
	class C extends Model{
		void tripAll() 
		{
			System.out.println("thamilnadu");
	    }
	}
	
	class Main{
		
		public static void main(String[] args) {
			C obj= new C();
			obj.display();
			obj.tripAll();
		}
	}
