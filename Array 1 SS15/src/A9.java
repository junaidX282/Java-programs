
public class A9 {

	public static void main(String[] args) {
		
		int a[]={3, 7, 2, 9, 1, 4, 6, 5};
		
		int target=10;
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==10) {
					count++;
				}
			}
		}System.out.println(" Number of pairs with sum 10 ="+count);
		
	}
}
