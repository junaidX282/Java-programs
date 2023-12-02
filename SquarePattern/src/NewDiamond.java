
public class NewDiamond {

	public static void main(String[] args) {
		int i,j,n=5;
		for(i=1;i<n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(j=1;j<i;j++) {
				if(j==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(j=1;j<=i;j++) {
				if(j==i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(j=i;j<n;j++) {
				if(j==i) {
				System.out.print("*");
				}
				
			else {
				System.out.print(" ");
			}
		}
			for(j=i;j<=n;j++) {
				if(j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}		
	}
}
