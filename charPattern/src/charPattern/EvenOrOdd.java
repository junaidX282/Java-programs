package charPattern;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		int i,j,n=5;int p;
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				if(i%2==0) {
					System.out.print("B ");
				} 
				else {
					System.out.print("A ");
				}	
			}System.out.println();
			
			
		}
		System.out.println();
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(j=i;j<=n;j++) {
				if(i%2==0) {
					
				System.out.print("O ");
				}
				else {
					System.out.print("Z ");
				}
			}System.out.println();
		}
		System.out.println();
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=i;j++) {
				
				if(i%2==0) {
				System.out.print("# ");
				}
				else {
					System.out.print("A ");
				}
			}
			for(j=1;j<i;j++) {
				if(i%2==0) {
				System.out.print("# ");
				}
				else {
					System.out.print("A ");
				}
			}System.out.println();
		}
		System.out.println();
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(j=i;j<=n;j++) {
				if(i%2==0) {
				System.out.print("O ");
				}
				else {
					System.out.print("Z ");
				}
			}
			for(j=i;j<n;j++) {
				if(i%2==0) {
					System.out.print("O ");
				}
				else {
					System.out.print("Z ");
				}
			}System.out.println();
		}
		
		
	}
}
