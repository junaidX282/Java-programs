
public class A2 {

	public static void main(String[] args) {
		int a[]= {-10, 8, -6, 4, -2, 5};
		 int s=a[0];
		 for(int i=0;i<a.length;i++) {
			 if(a[i]<0 ) {
				 if(s>0) {
					 s=a[i];
				 }else if(s>a[i]) {
					 s=a[i];
				 }
			 }
		 }System.out.println(s);
	}
}
