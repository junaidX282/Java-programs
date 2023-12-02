
public class A31 {

	public static void main(String[] args) {
		int a[]={5, 2, 8, 7, 3, 1, 9};
		
		int temp=0,index=3;
		
		for(int i=0;i<a.length;i++) {
			if(i<index) {
				for(int j=i+1;j<index-1;j++) {
					if(a[i]>a[j]) {
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			else {
				for(int k=i+1;k<a.length;k++) {
					if(a[i]<a[k]) {
						temp=a[i];
						a[i]=a[k];
						a[k]=temp;
						
					}
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	
}
