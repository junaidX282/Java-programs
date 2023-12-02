
public class A8 {

	public static void main(String[] args) {
		
		int []a= {5,2,8,5,9,2,7,10};	
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[j]=0;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
