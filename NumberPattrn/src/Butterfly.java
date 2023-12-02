
public class Butterfly {

	public static void main(String[] args) {
		
		int i,j,p,n=5;
		
		for(i=1;i<=n;i++) {
		p=1;
		
		for(j=1;j<=i;j++) {
			System.out.print(p+++" ");
		}
		for(j=i;j<n;j++) {
			System.out.print("  ");
		}
		for(j=i;j<n;j++) {
			System.out.print("  ");
		}
		p=1;
		for(j=1;j<=i;j++) {
			System.out.print(p+++" ");
		}
		System.out.println();
		}
		for(i=1;i<n;i++) {
			p=1;
			for(j=i;j<n;j++) {
				System.out.print(p+++" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=i;j++) {
				System.out.print("  ");
			}
			p=1;
			for(j=i;j<n;j++) {
				System.out.print(p+++" ");
			}System.out.println();
		}
		
		for(i=1,p=n;i<=n;i++,p--) {
			int k=p;
			for(j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(j=i;j<=n;j++) {
				System.out.print(k--+" ");
			}System.out.println();
			
		}
		p=1;
		for(i=1;i<=n;i++) {
			 
			for(j=1;j<i;j++) {
			System.out.print(p+++" ");
			}System.out.println();
		}		System.out.println();
		
		for(i=1,p='A';i<=n;i++,p++) {
			
			for(j=1;j<=i;j++) {
				System.out.print((char )p+" ");
			}System.out.println();
		}
	}
}
