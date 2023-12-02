package patternSimple;

public class A35 {

	public static void main(String[] args) {
		int s=0;
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=8;j++) {
				if(j<=i || j>=9-i ) {
					if(j<=4) {
						System.out.print(++s+" ");
					}else {
						System.out.print(s--+" ");
					}
				}else{
					System.out.print("  ");
			}
		}System.out.println();
	}
}
}