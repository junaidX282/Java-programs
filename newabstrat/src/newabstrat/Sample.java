package newabstrat;

public class Sample extends Start {

	void ontext(String text) {
		System.out.println(text);
	}
	
	
	
	
	public static void main(String[] args) {
		Sample s=new Sample();
		TextScanner ts=new TextScanner(s);
		ts.scan();
	}
}
