
public class Square {

	public static void main(String[] args) {
		
		int i,j,n=5;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(j==n/2+1||i==n/2+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				if(i==1||j==1||i+j==n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}System.out.println();
		
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				if(j==1||i==n) {
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(j=2;j<=i;j++) {
				if(j==i||i==n) {
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
				if(j==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(j=1;j<=i;j++) {
				if(j==i)
				System.out.print("*");
			
			else 
				System.out.print(" ");
				
			}System.out.println();
		}
		for(i=1;i<=n;i++) {
			for(j=1;j<i;j++) {
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
				
				if(j==n)
				System.out.print("*");
				else {
					System.out.print(" ");
			}
		
				
				
			}System.out.println();
		}
		
		for(i=1;i<n;i++) {
			for(j=1;j<=n;j++) {
				if(j==i) {
					System.out.print("*");
				}
				else {
			
					System.out.print(" ");
				}
				
			}
			for(j=i;j<n-1;j++) {
				if(j==3) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
			
		}
	}
}
