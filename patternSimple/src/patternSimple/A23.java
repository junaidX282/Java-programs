package patternSimple;

public class A23 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=9;j++) {
				if(j==2+i || j==6+i || j==4-i || j==8-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
					
			}System.out.println();
	}
}
}