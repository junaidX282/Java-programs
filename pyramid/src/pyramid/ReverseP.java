package pyramid;

public class ReverseP {

public static void main(String[] args) {
	
	
	int a,i,j,k,n=5;
	for(i=1;i<=n;i++) {
		for(j=i;j<=n;j++) {
			System.out.print("*");
		}
		for(k=i;k<n;k++) {
			System.out.print("*");
		}System.out.println();
		for(a=1;a<=i;a++) {
			System.out.print(" ");
		}
	}
}
		
		
	}
	
	