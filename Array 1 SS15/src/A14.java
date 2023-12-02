
public class A14 {
	public static void main(String[] args) {
		
		int []a={0, 1, 2,3, 6, 9};
		for(int i=0;i<a.length;i++) {
			if(a[i]!=i) {
				System.out.println(i);
				break;
			}
		}
	}
}
