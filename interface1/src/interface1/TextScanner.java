package interface1;

public class TextScanner {

	Helllo obj;
	public TextScanner(Helllo ob) {

		obj=ob;
		
	}
	
	void scan() {
		
		
		String result="Helllo obj;\r\n"
				+ "	public TextScanner(Helllo ob) {\r\n"
				+ "\r\n"
				+ "		obj=ob;\r\n"
				+ "		\r\n"
				+ "	}";
		obj.ontext(result);
	}
}
