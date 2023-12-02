
public class A12 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			int a=1;char b='A';
			for(int j=1;j<=6-i;j++) {
				System.out.print(a+++""+b+++"");
			}System.out.println();
		}
	}
}
