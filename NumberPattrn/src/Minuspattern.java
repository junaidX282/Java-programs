
public class Minuspattern {

	public static void main(String[] args) {
		
		int i,j,p,n=5;
		
		
			for(i=1,p=8;i<=n;i++,p-=2) {
		
				for(j=1;j<=i;j++) {
					System.out.print(" ");
				}
				for(j=i;j<=n;j++) {
					System.out.print(p+"");
				}
				for(j=i;j<n;j++) {
					System.out.print(p+"");
				}System.out.println();
		}
		
			for(i=1;i<=n;i++) {
				for(j=1;j<=i;j++) {
					System.out.print(" ");
				}
				for(j=i;j<=n;j++) {
					if(i%2==0) {
						System.out.print("$");
					}else {
						System.out.print("#");
					}
				}System.out.println();
				System.out.println();
				
			}
			for(i=1;i<=n;i++) {
				for(j=i;j<=n;j++) {
					System.out.print(" ");
				}
				for(j=1;j<=i;j++) {
					if(i%2==0) {
					
					System.out.print("b");
				}else {
					System.out.print("a");
				}
			}
				for(j=2;j<=i;j++) {
					if(i%2==0) {
						System.out.print("b");
					}
					else {
						System.out.print("a");
					}
				}System.out.println();
				
				
		}
			System.out.println();
			
			for(i=1;i<=n;i++) {
				for(j=1;j<=i;j++) {
					if(i%2==0) {
						System.out.print("B");
					}
					else {
						System.out.print("A");
					}
					
				}System.out.println();
			}
			System.out.println();
			
			for(i=1;i<=n;i++) {
				for(j=1;j<i;j++) {
					System.out.print(" ");
				}
				for(j=i;j<=n;j++) {
					if(i%2==0) {
						System.out.print("3");
					}
					else {
						System.out.print("1");
					}
					
				}System.out.println();
			}
			
		
	}
}
