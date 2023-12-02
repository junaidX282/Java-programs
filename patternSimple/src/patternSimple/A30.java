package patternSimple;

public class A30 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			int n=5;
			for(int j=1;j<=9;j++) {
				if(j>=6-i && j<=4+i) {
					System.out.print(n+" ");
				}else {
					System.out.print("  ");
				}
				if(j<=4) {
					n--;
				}
				else {
					n++;
				}
			}System.out.println();
		}
	}
}
