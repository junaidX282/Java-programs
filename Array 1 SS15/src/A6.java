
public class A6 {

	public static void main(String[] args) {
		int i,n=0;
		int a[]= {6,5,4,3,2,1},temp;//    1 2 3 4 5 6 7      1 7 2 6 4 5
		int b[]=new int[10];
		
		for(i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}int c=a.length-1;
		for(i=0;i<a.length;i+=2) {
			b[i]=a[n];
			b[i+1]=a[c-n];
			n++;
		}
		for(i=0;i<a.length;i++) {
			System.out.println(b[i]);
		}
			
	}
}
