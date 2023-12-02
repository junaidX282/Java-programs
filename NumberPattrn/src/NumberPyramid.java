
public class NumberPyramid {

	
	public static void main(String[] args) {
		
		int i,j,p,n=5;
		
		for(i=1,p=1;i<=n;i++,p++) {
			
			for(j=i;j<n;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				
				System.out.print(p+"");
			}
			for(int k=1;k<=i-1;k++) {
			
				System.out.print(p+"");
			}System.out.println();
		
			
		}System.out.println();
		
		int k;
		
		for(i=1,p=1;i<=n;i++,p++) {
			for(j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(k=i;k<=n;k++) {
				System.out.print(p+"");
			}
			for(k=i;k<n;k++) {
				System.out.print(p+"");
			}System.out.println();
		}
		System.out.println();
		
		for(i=1,p=0;i<=n;i++,p+=2) {
			
			for(j=1;j<=i;j++) {
				System.out.print(p+"");
			}System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}
}
