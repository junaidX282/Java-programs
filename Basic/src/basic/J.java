package basic;

public class J {
 int c;
	J(int a){
		c=a;
	}
	J(J obj){
		c=obj.c;
	}
	
	public static void main(String[] args) {
		
		J obj = new J(8);
		J obj1 = new J(obj);
		
		System.out.println(obj1.c);
	}
}
