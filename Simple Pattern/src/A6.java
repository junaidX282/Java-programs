
public class A6 {

	public static void main(String[] args) {
		
		
			
			for(int i=1;i<=5;i++) {
				for(int j=i;j<=5;j++) {
					if(j==1||j==i||j==5||i==1) {
						System.out.print(j+" ");
					}
					else {
						System.out.print("  ");
					}
				}System.out.println();
			}
		}
	
}
