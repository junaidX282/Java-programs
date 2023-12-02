
public class A16 {

	public static void main(String[] args) {
		int k=3;
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=k-2;j++) {
				System.out.print(k+" ");
			}System.out.println();
			if(i<=3) {
				k++;
			}else {
				k--;
			}
		}
	}
}
