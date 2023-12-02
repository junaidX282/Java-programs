
public class A35 {

	public static void main(String[] args) {
		int a[]={5, 5, 5, 5, 5, 5, 5, 5};
		int c=a.length;
		for(int i=0;i<c;i++) {
				for(int j=i+1;j<c;j++) {
					if(a[i]==a[j]) {
						for(int k=j;k<c-1;k++) {
							a[k]=a[k+1];
						}
						c--;
						j--;
				    }
			    }
		}
		for(int i=0;i<c;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
