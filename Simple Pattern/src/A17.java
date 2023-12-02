
public class A17 {

	public static void main(String[] args) {
		int k=1,n=1;
		for(int i=1;i<=8;i++) {
			for(int j=1;j<=k;j++) {
				if(j%2==1) {
					System.out.print(n);
				}else {
					System.out.print("*");
				}
			}System.out.println();
			if(i==4) {
				continue;
			}
			if(i<=3) {
				k+=2;n++;
			}else {
				k-=2;n--;
			}
		}
	}
}
