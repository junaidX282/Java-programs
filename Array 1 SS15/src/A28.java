
public class A28 {

	public static void main(String[] args) {
		int a[]={3, 7, 2},b[]={9, 1, 4, 6};
		int l=a.length+b.length;
		int ab[]=new int[l];
		int c=0;
		for(int i=0;i<a.length+b.length;i++) {
			if(i<a.length) {
				ab[i]=a[i];
			}else {
				ab[i]=b[c];
				c++;
			}
		}
		for(int i=0;i<ab.length;i++) {
			System.out.print(ab[i]+" ");
		}
	}
}
