package star2;

public class Pyramid {

	public static void main(String[] args) {
		
		int i,j,k=0;
		int []p= {1,2,3,4,5};
		
		for(i=1;i<=3;i++,k++) {
			for(j=1;j<=i*2;j++) {
				System.out.print(p[k]+" ");
				
			}System.out.println();
			for(j=0;j<=i*3;j++) {
				if(i==3) {
					break;
				}
				System.out.println(p[k]+" ");
			}
			if(p[k]%2==1) {
				k+=2;
			}
		}
	}
}
