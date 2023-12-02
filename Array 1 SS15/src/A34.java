
public class A34 {

	public static void main(String[] args) {
		int n=7;
		int i=2;
		int flag=0;
		while(i<=n/2) {
			if(n%2==0) {
				flag=1;
				break;
			}
			i++;
		}if(flag==0) {
			System.out.println("number is prime");
		}else {
			System.out.println("number not pime");
		}
	}
}
