package patternSimple;

public class A31 {

public static void main(String[] args) {
		
		for(int i=1;i<=7;i++) {
			
			for(int j=1;j<=7;j++) {
				if(i==1||i==7||j==1||j==7) {
					System.out.print(4+" ");
				}else if(i==2||j==2||i==6||j==6) {
					System.out.print(3+" ");
				}else if(i==3||j==3||i==5||j==5) {
					System.out.print(2+" ");
				}else  {
					System.out.print(1+" ");
				}
		}System.out.println();
	}
}
}
