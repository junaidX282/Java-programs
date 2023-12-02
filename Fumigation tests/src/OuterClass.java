

public class OuterClass {
	
	int x=10;
	
class InnerClass{
	
	int y=50;
}

}
class B{
	
	public static void main(String[] args) {
		
		OuterClass out=new OuterClass();
		OuterClass.InnerClass inner=out.new InnerClass();
		
		System.out.println(inner.y );
	}
}