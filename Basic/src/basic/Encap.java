
package basic;
public class Encap {
	
	Encap(int a){
		
		System.out.println("super");
		
	}

	
	protected int a;
	protected int b;
	
		public int setGet(int a) {
			this.a=a;
			return a;
		}
	
}
class Demo4 extends Encap{
	
	
     Demo4(){
    	 super(34);
		
		System.out.println("sub");
	 }
}

class Samp{
	
	public static void main(String[] args) {
		
		Demo4 d=new Demo4();
//		int a=e.setGet(4);
//		System.out.println(a);
	}
}