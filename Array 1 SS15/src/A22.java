
public class A22 {

	public static void main(String[] args) {
		int a[]={7, 4, 11, 8, 17},sum=0;
		
		for(int i=0;i<a.length;i++) {
			int flag=0;
			
			for(int j=2;j<=a[i]/2;j++) {
				if(a[i]%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.print(a[i]*a[i]+" ");
			}
		}
	}
}
