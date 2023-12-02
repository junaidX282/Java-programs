
public class A5 {

	public static void main(String[] args) {
		
		int arr[]= {4, 3, 4, 4, 6, 5, 6, 5, 5};
		int fr[]= {-1, -1, -1, -1, -1, -1, -1, -1, -1};
		
		for(int i=0;i<arr.length;i++) {
			if(fr[i]!=0) {
				int count=1;
				int flag=0;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
						fr[j]=0;
					}
				}
				fr[i]=count;
			}
		}int c=0;
		for(int i=0;i<fr.length;i++) {
		   
			if(fr[i]%2==1) {
			 c++;
			}
		}System.out.println(c);
	}
}
