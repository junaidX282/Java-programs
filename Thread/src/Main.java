
public class Main {

	public static void main(String[] args) {
		
		
		Sample s=new Sample(1);
		Thread t=new Thread(s);
		
		t.run();
		Sample s2=new Sample(2);
		Thread t1=new Thread(s);
		
		t1.run();;
		Sample s3=new Sample(3);
		Thread t2=new Thread(s);
		
		t2.run();
		Sample s4=new Sample(4);
		Thread t3=new Thread(s);
		
		t3.run();
		
		
		
	}
}
