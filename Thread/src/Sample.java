
public class Sample implements Runnable{
	
	int a;
	
	Sample(int a){
		this.a=a;
	}
 
	
	public void run() {
		
		
		
		for(int i=1;i<=10;i++) {
				System.out.println("count"+i+"thread");
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		}
	}
}
