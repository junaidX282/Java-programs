
public class A20 {

	public static void main(String[] args) {
		int a[]={5, 12, 7, 4, 11, 9},sum=0;
		
		for(int i=0;i<a.length;i++) {
			int flag=0;
			
			for(int j=2;j<=a[i]/2;j++) {
				if(a[i]%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				sum=sum+a[i];
			}
		}System.out.println("Sum of primes "+ sum);
	}
}
