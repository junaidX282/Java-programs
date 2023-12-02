package patternSimple;

public class A33 {

	public static void main(String[] args) {
		int s=1;char a='a',b='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(s%2==1) {
					System.out.print(a+" ");
				}else {
					System.out.print(b+" ");
				}s++;a++;b++;
			}System.out.println();
			
		}
	}
}
