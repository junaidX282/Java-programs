package dowhile;

public class Dowhile {
	
	final int a=78;
	static int b=99;
	int ac=77;

	public static void main(String[] args) {
		
		String[] ab={"junu","abc","ijk","tyngf"};
		
		for(String i:ab) {
			System.out.println(i);
		}
		
		int ac[]= {1,2,3,4,5};
		
		for(int i:ac) {
			System.out.println(i);
		}
		
		Dowhile d=new Dowhile();
		System.out.println(d.a);
	}
}