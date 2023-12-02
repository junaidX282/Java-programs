package pyramid;

public class Pyramid {

	public static void main(String[] args) {
		int i,j,k,a,n=10;
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print("*");
			}
			for(a=2;a<=i;a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1;i<=n;i++) {
			for(j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(k=i+1;k<=n;k++) {
				System.out.print("*");
			}
			for(a=i+1;a<n;a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
}
