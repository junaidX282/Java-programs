package patternSimple;

public class A20 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=4;j++) {
				if(j==1|| j==4|| i==1|| i==5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
}
