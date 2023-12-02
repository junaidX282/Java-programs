
public class SampleThread extends Thread {

	int a;
	
	SampleThread(int n){
		a=n;
	}
	
	
		public void run() {
			for(int i=1;i<=10;i++) {
				System.out.println("count "+i+" thread "+a);
				Thread.sleep(10);
		}
	}
   }
class Main3{
	
	public static void main(String[] args) {
		SampleThread obj =new SampleThread(1);
		obj.start();
	}
}
