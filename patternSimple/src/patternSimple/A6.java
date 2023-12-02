package patternSimple;

public class A6 {


public static void main(String[] args) {
		
	int i,j,n=5;
	for(i=1;i<=5;i++) {
		for(j=1;j<=5;j++) {
			if(j>=n) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}System.out.println();
		n--;
	}
  }

}
