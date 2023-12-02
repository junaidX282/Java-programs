package patternSimple;

public class A7 {

	public static void main(String[] args) {
		int i,j,n=1;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(j>=n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
			n++;
		}
	}
}
