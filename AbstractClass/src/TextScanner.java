
public class TextScanner {
	
	Hello ob;
	
	public TextScanner(Hello obj) {

		ob=obj;
	}

	void scan() {
		
		String text="scanned text";
		ob.onText(text);
	}
}
