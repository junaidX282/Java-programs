package patternSimple;

public class A8 {

	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=9;j++) {
				if(j>=6-n && j<=4+n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			if(i==5) {
				continue;
			}
			if(i<=4) {
				n++;
//			}else {
//				n--;
			}
		}
	}
}
