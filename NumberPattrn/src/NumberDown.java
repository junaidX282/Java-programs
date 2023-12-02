
public class NumberDown {

	public static void main(String[] args) {
		
		int i,j,p,n=8;
		
		for(i=1,p=n;i<=n;i++,p--) {
			for(j=1;j<=i;j++) {
				System.out.print(p+" ");
			}System.out.println();
		}System.out.println();
		
		for(i=1,p=n;i<=n;i++,p--) {
			
			for(j=i;j<=n;j++) {
				System.out.print(p+"");
			}System.out.println();
			
			for(j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
		}
		
	}
}
