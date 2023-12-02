
public class A5 {

public static void main(String[] args) {
		
	for(int i=1;i<=5;i++) {
		int n=1;
		for(int j=1;j<=9;j++) {
			if(j==6-i || j==4+i || i==5 && j%2==1) {
				if(j>5  ) {
					n=i;
					if(i==5 && j==7) {
						n=4;
					}
				}			
				System.out.print(n++ +" ");					
			}
			else {
				System.out.print("  ");
			}
		}System.out.println();
	}

	}
}
