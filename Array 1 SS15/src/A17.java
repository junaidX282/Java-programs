
public class A17 {

	public static void main(String[] args) {
		int a[]={8, 4, 6, 2, 10};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==12) {
					System.out.println(" Pair with sum 12: "+a[i]+" and "+a[j]);
				}
			}
		}
	}
}
