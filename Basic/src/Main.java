
public class Main {

	int a;
	
	int sum(int a,int b,int c) {
		return a+b+c;
	}
}
class Junu{
	
	public static void main(String[] args) {
		
		Main obj=new Main();
		int s=obj.sum(10,10,5);
		System.out.println(s);
	}
}