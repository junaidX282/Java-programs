
public class reverseArray {

	
	
	int [] a= {1,2,3,4,5,6,7,8,9,10};
			int i,c=a.length-1;
	public void reverse() {
		
		for(i=0;i<a.length/2;i++) {
			int temp=a[i];
			a[i]=a[c-i];
			a[c-i]=temp;
			
			
		}
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		
		reverseArray r =new reverseArray();
		r.reverse();
	}
}
