package patternSimple;

public class A32 {

	public static void main(String[] args) {
		char s='E';
		for(int i=1;i<=5;i++,s--) {
			char d=s;
			for(int j=1;j<=i;j++) {
				System.out.print(d+++" ");
			}System.out.println();
		}
	}
}
