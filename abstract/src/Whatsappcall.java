
public interface Whatsappcall {

	void call();
	void mute();
	void disconnect();
	
}
class Audiocall implements Whatsappcall{

	
	public void call() {
		System.out.println("audio calling...");
	}

	
	public void mute() {
		System.out.println("call muted");
	}

	public void disconnect() {
		System.out.println("call disconnected");
	}
	
}
class Videocall implements Whatsappcall{

	@Override
	public void call() {
		System.out.println("video calling...");
	}

	public void mute() {
		System.out.println(" muted");
	}

	public void disconnect() {
		System.out.println("call disconnect");		
	}
	
}



