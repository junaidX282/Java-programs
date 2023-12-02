
public class main implements Hello {

	public void display(String text) {
		
		System.out.println(text);
	}
	
	main(){
		
		TextScan ts=new TextScan(this);
		ts.scan();
	}

	
	public static void main(String[] args) {
		
		main m=new main();
		
	}
}


	