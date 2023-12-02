package getset;

public class Sample1 {

	public static void main(String[] args) {
		
		int[] arr= {3,9,1,4,7};
		
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print(arr[j]+" ");
			}System.out.println();
		}
		
		char p='A';
		for(int i=1;i<=4;i++,p++) {
			char c=p;
			for(int j=1;j<=i;j++) {
				System.out.print(c--+" ");
			}System.out.println();
		}
		int i,j,m,c;
		for(i=1,m=1;i<=4;i++,m++) {
			c=m;
			for(j=1;j<=7;j++) {
				if(j>=5-i && j<=3+i) {
					System.out.print(c+" ");
					j<4 ?c--:c++;
				}
				else {
					System.out.print("  ");
				}
			}
		}
		
		
		
		
		
	}
}
