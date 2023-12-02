
public class A15 {

	public static void main(String[] args) {
		int a[]= {4, 8, 2, 5};
		int k=a.length-1;
		//System.out.println(k);
		for(int i=0;i<a.length/2;i++) {
			
			a[i]=a[i]+a[k-i];
			a[k-i]=a[i]-a[k-i];
			a[i]=a[i]-a[k-i];
		}
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
	}
}
