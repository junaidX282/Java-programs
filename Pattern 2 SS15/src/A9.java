
public class A9 {

	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=5;i++,k++) {
			for(int j=i;j<=k+i-1;j++) {
				if(j%2==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("$ ");
				}
			}System.out.println();
		}
	}
}
