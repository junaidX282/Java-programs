
public class Wrapperlass {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		
		
		
		try {
			System.out.println(a[8]);
		}catch (Exception e) {
			System.out.println("something wrong");
		}
		finally {
			System.out.println("finished");
		}
	}
}
	