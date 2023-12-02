
public class Pyramid {

	public static void main(String[] args) {
		
		int i,j,n=5;
		
		for(i=1;i<=n;i++) {
			for(j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=i;j++) {
				if(i%2==0) {
					System.out.print("$ ");
				}
				else {
					System.out.print("# ");
				}
			}
			for(j=1;j<i;j++) {
				if(i%2==0) {
					System.out.print("$ ");
				}
				else {
					System.out.print("# ");
				}
			}System.out.println();
			
			
			
		}
		System.out.println();
		for(i=1;i<=n;i++) {
			for(j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(j=i;j<=n;j++) {
				if(i%2==0) {
				System.out.print("0 ");
				}
				else {
					System.out.print("1 ");
				}
			}
			for(j=i;j<n;j++) {
				if(i%2==0) {
					System.out.print("0 ");
				}
				else { 
					System.out.print("1 ");
				}
			}System.out.println();
				
			}
		System.out.println();
		int p;
		for(i=1,p=1;i<=n;i++,p++) {
			for(j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(p+" ");
			}
			for(j=1;j<i;j++) {
				System.out.print(p+" ");
			}System.out.println();
		}
		for(i=1,p=6;i<n;i++,p++) {
			for(j=0;j<=i;j++) {
				System.out.print("  ");
			}
			for(j=i;j<n;j++) {
				System.out.print(p+" ");
			}
			for(j=i;j<n-1;j++) {
				System.out.print(p+" ");
			}System.out.println();
		}
		p=3;
		for(i=1;i<=n;i++) {
			for(j=i;j<n;j++) {
				System.out.print("  ");
			}
			p=1;
			for(j=1;j<=i;j++) {
				
				System.out.print(p+++" ");
			}
			
			for(j=1;j<i;j++) {
				System.out.print(p+++" ");
			}System.out.println();
		}System.out.println();
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(" ");
			}
			p=1;
			for(j=i;j<=n;j++) {
				System.out.print(p+++"");
			}System.out.println();
		}
		
		
		}
	}

