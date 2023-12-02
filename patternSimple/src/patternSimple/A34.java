package patternSimple;

public class A34 {

	public static void main(String[] args) {
		char s='E';
		for(int i=1;i<=5;i++,s--) {
			char d=s;
			for(int j=i;j<=5;j++) {
				System.out.print(d--+" ");
			}System.out.println();
		}
	}
}
