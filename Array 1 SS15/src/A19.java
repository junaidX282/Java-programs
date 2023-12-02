
public class A19 {

	public static void main(String[] args) {
		
		int a[]={9, 14, 3, 8, 18, 7},pc=0, exc=0;
		int []ex=new int[10];
		int []p=new int[10];
		for(int i=0;i<a.length;i++) {
			int flag=0;
			if(a[i]%3==0) {
				ex[exc]=a[i];
				exc++;
			}
			for(int j=2;j<=a[i]/2;j++) {
				if(a[i]%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				p[pc]=a[i];
				pc++;
			}
		}System.out.print("primes: ");
		for(int i=0;i<pc;i++) {
			System.out.print(p[i]+" ");
		}
		System.out.println();
		
		
		System.out.print("Multiples of five ");
		for(int i=0;i<exc;i++) {
			System.out.print(ex[i]+" ");
		}
	}
}
