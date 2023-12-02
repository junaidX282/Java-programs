
public class Sample {

	 void calculation(int n) {
		 int fact=1;
		 for(int i=1;i<=n;i++) {
			 fact=fact*i;
		 }
		 System.out.println("factorial is "+fact);
	 }
}
class Main{
	public static void main(String[] args) {
		
		new Sample().calculation(5);
	}
}