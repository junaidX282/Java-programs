
public class A27 {

	public static void main(String[] args) {
		int a[]={5, 8, 2, 10, 15};
		int temp=0;
		int c=a.length-1;
		for(int i=0;i<a.length/2;i++) {
			temp=a[i];
			a[i]=a[c-i];
			a[c-i]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
