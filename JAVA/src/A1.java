
public abstract class A1 {

	protected A1(){
		System.out.println("Absract constructor");
	}
	
}
class B extends A1{
	
	B(){
		System.out.println("class B");
	}
	
	
}
class Bc extends B{
	
	Bc(){
		System.out.println("bc constructor");
	}
public static void main(String[] args) {
		
		E obj =new E();
		String a="junu";
		char []av=a.toCharArray();  
		//for(int i=0;i<)
	}
}
class D extends Bc{
	
	D(){
		System.out.println("D constructor");
	}
    
}
class E extends Bc{
	E (){
		System.out.println("E constructor");
		
	}
}

