
public class B extends A {

	int a=40;
	
	void display(){
		super.a=a;
		System.out.println(a+"  "+super.a);
		
		System.out.println("class B");
		
	}
		
	B(){
			
			System.out.println("B constucter");
		}
	
	B(int a){
		
		System.out.println("argument B");
	}
	
	void basedisplay() {
		super.display();
	}
	}
