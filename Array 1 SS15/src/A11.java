
public class A11  {

	public static void main(String[] args) {
		
		int a[]={4, 7, 4, 2, 9, 4};
		int fr[]={-1, -1, -1, -1, -1, -1};
		
		for(int i=0;i<a.length;i++) {
			int count =1;
			for(int j=i+1;j<a.length;j++) {
				if(fr[i]!=0) {
					if(a[i]==a[j]) {
						count++;
						fr[j]=0;
					}
				}
			}
			fr[i]=count;
		}
		for(int i=0;i<a.length;i++) {
			if(fr[i]>1) {
				System.out.println(a[i]+" occur "+fr[i]+" times");
			}
		}
	}
}
