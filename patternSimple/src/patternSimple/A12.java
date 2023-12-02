package patternSimple;

public class A12 {

	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=5;j++) {
				if(j>=k) {
					System.out.print("* ");
				}
				else{
					System.out.print(" ");
				}
			}System.out.println();
			if(i==5 ) {
				continue;
			}
			if(i<=4) {
				k++;
			}else {
				k--;
			}
		 }
	}
}
