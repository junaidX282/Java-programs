package patternSimple;

public class A11 {


	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				if(j>=i) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
//			if(i==5) {
//				continue;
//			}
			if(i<=4) {
				n--;
//			}else {
//				n--;
			}
		}
	}
}
