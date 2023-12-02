import java.io.File;
public class Sample {

	
	public static void main(String[] args) {
	
		File f=new File(fileName:"C:\Users\LENOVO\OneDrive\Desktop\Sa.text");
		try {
			boolean status=f.createNewFile();
			if(status) {
				System.out.println("file created");
			}else {
				System.out.println("file already exist");
			}
		}catch(Exception ex) {
			System.out.println(" an error");
		}
	
		
}
}
