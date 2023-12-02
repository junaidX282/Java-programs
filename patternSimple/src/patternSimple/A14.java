package patternSimple;

public class A14 {

	public static void main(String[] args) {
		int i,j,n=5;
		for(i=1;i<=5;i++) {		
			for(j=1;j<=5;j++) {
				if(i==1) {
					System.out.print("*********");
					break;
				}
				if(j>=i) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
			n--;
		}
	}
}
