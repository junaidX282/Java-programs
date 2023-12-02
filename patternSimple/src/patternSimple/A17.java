package patternSimple;

public class A17 {

	public static void main(String[] args) {
		int n,k=1;
		for(int i=1;i<=7;i++) {
			n=4;
			for(int j=1;j<=7;j++) {
				
				if(j>=5-k && j<=3+k) {
					System.out.print(n);
				}
				else {
					System.out.print(" ");
				}
					if(j<=3) {
						n--;
					}else {
						n++;
					}
				
			}System.out.println();
			if(i<=3) {
				k++;
			}
			else {
				k--;
			}
		}
	}
}
