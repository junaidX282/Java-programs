package returnthis;

public class Ab {

	Ab display() {
		System.out.println("mmm");
		return this;
	}
	void msg() {
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		new Ab().display().msg();
	}
}
