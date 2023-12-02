
public class A8 {

	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=11;i++) {
			for(int j=1;j<=9;j++) {
				if(j>=6-k && j<=4+k) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
			if(i<=4 || i>=9) {
				k++;
			}else {
				k--;
			}
		}
	}
}
