
public class A10 {

	public static void main(String[] args) {
		int a[]={0, 2, 0, 5, 9, 0, 6};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				int temp=a[i];
				
				for(int j=i+1;j<a.length;j++) {
					if(a[j]!=0) {
						a[i]=a[j];
						a[j]=temp;
						break;
					}
				}
			}
			
		}for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}
}
