package newabstrat;

public class TextScanner {

	Start obj;
	TextScanner(Start obj){
		this.obj=obj;
	}
	
	
	void scan() {
		
	String text="text scanned";
	obj.ontext(text);
	}
}
