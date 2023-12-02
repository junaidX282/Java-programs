package patternSimple;

public class A29 {

	public static void main(String[] args) {
		
		int k=1;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=10;j++) {
				if(j<=k || j>=11-k) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
			if(i<=4) {
				k++;
			}else {
				k--;
			}
		}
	}
}
