package charPattern;

public class Abc {

	public static void main(String[] args) {
		
		int i,j,p,n=5;
		
		for(i=1,p='A';i<=n;i++,p++) {
			for(j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(j=i;j<=n;j++) {
				System.out.print((char)p+"");
			}System.out.println();
			
			
		}
		
		for(i=1,p='A';i<=n;i++,p++) {
			for(j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=i;j++) {
				System.out.print((char)p+" ");
			}
			for(j=1;j<i;j++) {
				System.out.print((char)p+" ");
			}System.out.println();
		}System.out.println();
		
		for(i=1,p='A';i<=n;i++,p++) {
			for(j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(j=i;j<=n;j++) {
				System.out.print((char)p+" ");
			}
			for(j=i;j<n;j++) {
				System.out.print((char)p+" ");
			}System.out.println();
		}
		for(i=1,p='E';i<=n;i++,p--) {
			for(j=1;j<=i;j++) {
				System.out.print((char)p+" ");
			}System.out.println();
		}System.out.println();
		
		for(i=1,p='E';i<=n;i++,p--) {
			for(j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(j=i;j<=n;j++) {
				System.out.print((char)p+" ");
			}System.out.println();
		}
		
		for(i=1,p='E';i<=n;i++,p--) {
			for(j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=i;j++) {
				System.out.print((char)p+" ");
			}
			for(j=1;j<i;j++) {
				System.out.print((char)p+" ");
			}System.out.println();
		}System.out.println();
		
		for(i=1,p='E';i<=n;i++,p--) {
			for(j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(j=i;j<=n;j++) {
				System.out.print((char)p+" ");
			}
			for(j=i;j<n;j++) {
				System.out.print((char)p+" ");
			}System.out.println();
		}
		
		for(i=1,p='A';i<=n;i++,p+=2) {
			for(j=1;j<=i;j++) {
				System.out.print((char)p+" ");
			}System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
