package patternSimple;

public class A28 {

	public static void main(String[] args) {
		int k=5;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=5;j++) {
				if(j>=k) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
			if(i<=4) {
				k--;
			}else {
				k++;
			}
		}
	}
}
