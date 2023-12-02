
public class PatternR {

	public static void main(String[] args) {
		
		int i,j,k,n=15;
		
		for(i=1;i<=n;i++) {
			for(j=i;j<=n;j++) {
				System.out.print("*");
			}System.out.println();
			for(k=1;k<=i;k++) {
				System.out.print(" ");
			}
		}
	}
}
