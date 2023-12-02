
public class One22333 {

	public static void main(String[] args) {
		
		int i,j,p,n=5;
		
		for(i=1,p=1;i<=n;i++,p++) {
			
			for(j=1;j<=i;j++) {
				System.out.print(p+" ");
			}System.out.println();
		}
		
		for(i=1,p=1;i<=n;i++,p++) {
			
			for(j=2;j<=i;j++) {
				System.out.print(" ");
			}
			for(j=i;j<=n;j++) {
				System.out.print(p+"");
			}System.out.println();
		}
	}
}
