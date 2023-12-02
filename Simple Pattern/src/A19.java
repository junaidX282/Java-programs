
public class A19 {

	public static void main(String[] args) {
		int n=1;int f=1;
		for(int i=1;i<=7;i++) {
			int k=1;
			for(int j=1;j<=n;j++) {
				
				if(j==1 || j==n) {
					System.out.print(" *");
					
					
					
				}
				else {
					System.out.print(j<f?" "+k++ +" " : " " +k--+" ");
				}
			}System.out.println();
			if(i<=3) {
				n+=2;f++;
			}else {
				n-=2;f--;
			}
		}
	}
}
