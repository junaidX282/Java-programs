package patternSimple;

public class A22 {

public static void main(String[] args) {
	
	int n=1;
	for(int i=1;i<=5;i++) {
		for(int j=i;j<=i+n-1;j++) {
			if(j%2==1) {
				System.out.print("1 ");
			}else {
				System.out.print("0 ");
			}
				
			
		}System.out.println();
		n++;
	}
}
}
