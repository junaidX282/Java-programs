package charPattern;

public class Stringpattern {

	public static void main(String[] args) {
		
		int i,j,p;
		String s="CODER";
		int n=s.length();
		
		for(i=1,p=0;i<=n;i++,p++) {
			for(j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(j=i;j<=n;j++) {
				System.out.print(s.charAt(p)+" ");
			}System.out.println();
		}System.out.println();
		
		for(i=1,p=0;i<=n;i++,p++) {
			for(j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(s.charAt(p)+" ");
			}
			for(j=1;j<i;j++) {
				System.out.print(s.charAt(p)+" ");
			}System.out.println();
		}
		
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print("  ");
			}
			p=0;
			for(j=1;j<=i;j++) {
				System.out.print(s.charAt(p++)+" ");
			}System.out.println();
		}
		
		for(i=1;i<=n;i++) {
			p=n-1;
			for(j=1;j<=i;j++) {
				System.out.print(s.charAt(p--)+" ");
			}System.out.println();
		}System.out.println();
		int k;
		for(i=1,k=n-1;i<=n;i++,k--) {
			for(j=1;j<i;j++) {
				System.out.print("  ");
			}
			p=k;
			for(j=i;j<=n;j++) {
				System.out.print(s.charAt(p--)+" ");
			}System.out.println();
		}
		
		
		
		
	}
}
