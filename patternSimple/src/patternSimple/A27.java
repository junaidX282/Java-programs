package patternSimple;

public class A27 {

	public static void main(String[] args) {
		int n=1,p=17,t=1;
		for(int i=4;i>=1;i--,p=p-i) {
			int k=p;
			for(int j=1;j<=8;j++) {
			 if(j>=t && j<=9-t) {
				 if(j<=4) {
					 System.out.print(n++ +" ");
				 }else {
					 System.out.print(k+++" ");
				 }
				 
			 }
			 else {
				 System.out.print("  ");
			 }
			}System.out.println(); 
			t++;
			
		}
	}
}
