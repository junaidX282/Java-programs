package patternSimple;

public class A15 {

	public static void main(String[] args) {
		
		int i,j,n=1;
		
		for(i=1;i<=9;i++) {
			for(j=1;j<=9;j++) {
				if(j==6-n || j==4+n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
			if(i<=4) {
				n++;
			}else {
				n--;
			}
		}
	}
	
}
