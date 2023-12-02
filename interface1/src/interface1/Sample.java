package interface1;

public class Sample implements Helllo {

	
	public void ontext(String txt) {

		System.out.println(txt);
	}

	public static void main(String[] args) {
		Sample s=new Sample();
		TextScanner ts=new TextScanner(s);
		ts.scan();
	}
}
