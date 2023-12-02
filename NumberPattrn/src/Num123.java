
public class Num123 {

	public static void main(String[] args) {
		
		int i,j,k,p,n=5;
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(k=i;k<=n;k++) {
				System.out.print(" ");
			}
			for(k=i;k<n;k++) {
				System.out.print(" ");
			}
			
			
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}System.out.println();
			
		}
		System.out.println();
		
		for(i=1,p=n;i<=n;i++,p--) {
			for(j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print(p+"");
			}
			for(k=2;k<=i;k++) {
				System.out.print(p+"");
			}System.out.println();
		}
		System.out.println();
		for(i=1,p=n;i<=n;i++,p--) {
			for(j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(k=i;k<=n;k++) {
				System.out.print(p+"");
			}
			for(k=i;k<n;k++) {
				System.out.print(p+"");
			}System.out.println();
		}
	}
}
