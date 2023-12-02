package Sample2;

										// 	interface
	public interface WhatsappCall {
	
		void call();
		void mute();
		void disconnect();
	}
	
	class Audio implements WhatsappCall{

		
		public void call() {
			System.out.println("call start....");
		}

		
		public void mute() {
			System.out.println("call muted");
			
		}

		
		public void disconnect() {
			System.out.println("call disconnected");
			
		}
		
	}
	class VideoCall implements WhatsappCall{
		public void call() {
			System.out.println("video call started");	
					
		}

		
		public void mute() {
			
			System.out.println("video call muted");	
		}

		
		public void disconnect() {
			System.out.println("video call disconnected");	
			
		}
	}
	
	
