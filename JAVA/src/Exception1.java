
public class Exception1 {

	public static void main(String[] args) {
		
		
		try {
			
			int a =10/0;
			System.out.println(a);
			
		}catch (ArithmeticException e) {
			System.out.println("division not allowed 0");
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("pls check array index");
		} 
		catch (Exception e) {
			System.out.println("try another number");
		}finally {
			System.out.println("finished");
		}
	}
}
