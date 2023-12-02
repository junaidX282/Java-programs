
public class A18 {

	public static void main(String[] args) {
		
		int k=1,n=1,p=8;
		
		for(int i=1;i<=8;i++) {
			
			for(int j=1;j<=k;j++) {
				if(j%2==1) {
					System.out.print(n++);
				}
				else {
					System.out.print("*");
				}
				
			}System.out.println();
			if(i==4) {
				k=7;
				n=7;
				continue;
			}
			
			if(i<=3) {
				k+=2;
			}
			else {
				k-=2;
				 p/=2;
				 n=p;
			}
		}
	}
}
