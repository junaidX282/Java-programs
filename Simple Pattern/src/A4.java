
public class A4 {

public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			int n=i;
			for(int j=1;j<=9;j++) {
				if(j>=6-i && j<=4+i) {
					System.out.print(j<=4?n++ +" ":n--+" ");					
				}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	
 }
}
