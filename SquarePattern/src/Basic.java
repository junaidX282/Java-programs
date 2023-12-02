
public class Basic {

	public static void main(String[] args) {
		
		int i,j,n=5;
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				System.out.print("* ");
			}System.out.println();
		}System.out.println();
		
		
		
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(j==1||j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
		System.out.println();
		for(i=1;i<=n;i++){
			for(j=1;j<=n;j++) {
				if(i==n/2+1||j==n/2+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}System.out.println();
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(j==i||j+i==n+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}System.out.println();
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(j==1||j==n||i==1||i==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}System.out.println();
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				if(j==1||i==j||i==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {
				if(i==1||j==i||j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(j=1;j<i;j++) {
				if(j==1||i==n) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(j=1;j<=i;j++) {
				if(j==i||i==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		
		
		
	}
}
