
public class Sample {

	public static void main(String[] args) {
		int n=2,p=2;
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(j<=i) {
					System.out.print(" ");
				}else {
					System.out.print("* ");
				}
			}System.out.println();
		}
	}
}
