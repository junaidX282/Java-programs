
public class Throw {
	
	static void age(int a) {
		
		if(a<15) {
			throw new ArithmeticException("you are minor");
		}
		else {
			System.out.println("you are perfect");
		}
	}

	public static void main(String[] args) {
		
		age(4);
		
	}
}
