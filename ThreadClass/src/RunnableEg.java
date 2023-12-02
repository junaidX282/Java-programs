
public class RunnableEg implements Runnable{

	
	public void run() {
		System.out.println("model");
	}
	public static void main(String[] args) {
		RunnableEg r=new RunnableEg();
		Thread t=new Thread(r);
		t.start();
		
}
}
