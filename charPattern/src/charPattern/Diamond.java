package charPattern;

public class Diamond {

	public static void main(String[] args) {
		
		int p='A';
		int i,j,n=5;
		
		for(i=1;i<=n;i++,p++) {
			for(j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(j=1;j<=i;j++) {
				System.out.print((char)p+" ");
			}
			for(j=1;j<i;j++) {
				System.out.print((char)p+" ");
			}System.out.println();
			System.out.println();
			
		}
		for(i=1;i<n;i++,p++) {
			for(j=0;j<=i;j++) {
				System.out.print("  ");
			}
			for(j=i;j<n;j++) {
				System.out.print((char)p+" ");
			}
			for(j=i;j<n-1;j++) {
				System.out.print((char)p+" ");
			}System.out.println();
			System.out.println();
		}
		
		for(i=1;i<=n;i++) {
			p='A';
			for(j=1;j<=i;j++) {
				System.out.print((char)p+++" ");
			}System.out.println();
			
		}
		
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print("  ");
			}
			p='A';
			for(j=1;j<=i;j++) {
				
				System.out.print((char)p+++" ");
			}
			for(j=1;j<i;j++) {
				
				System.out.print((char)p+++" ");
			}System.out.println();
		}System.out.println();
		
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print("  ");
			} 
			
			p='A';
		 for(j=1;j<=i;j++) {
			 System.out.print((char)p+++" ");
			 }
		 for(j=1;j<i;j++) {
			 System.out.print((char)p+++" ");
		 }System.out.println();
		 
		}
		for(i=1;i<n;i++) {
			
			for(j=0;j<=i;j++) {
				System.out.print("  ");
			}p='A';
			for(j=i;j<n;j++) {
				System.out.print((char)p+++" ");
			}
			for(j=i;j<n-1;j++) {
				System.out.print((char)p+++" ");
			}System.out.println();
		}
		
		for(i=1;i<=n;i++) {
			p='E';
			for(j=1;j<=i;j++) {
				System.out.print((char)p--+" ");
			}System.out.println();
			
		}System.out.println();
		int k;
		for(i=1,k='E';i<=n;i++,k--) {
			for(j=1;j<i;j++) {
				System.out.print("  ");
			}	
			p=k;
			for(j=i;j<=n;j++) {
				System.out.print((char)p--+" ");
			}System.out.println();
		}
		for(i=1,k='E';i<=n;i++,k--) {
			for(j=i;j<=n;j++) {
				System.out.print("  ");
			}p=k;
			for(j=1;j<i;j++) {
				
				System.out.print((char)p+++" ");
			}p='E';
			for(j=1;j<=i;j++) {
				System.out.print((char)p--+" ");
			}System.out.println();
		}
		
		
		for(i=1,k='@';i<=n;i++,k++) {
			for(j=i;j<=n;j++) {
				System.out.print("  ");
			}p='A';
			for(j=1;j<=i;j++) {
				System.out.print((char)p+++" ");
			}
			
			p=k;
			for(j=1;j<i;j++) {
				System.out.print((char)p--+" ");
			}System.out.println();
		}
		
		
		
		
		
		
		
		
	}
}
