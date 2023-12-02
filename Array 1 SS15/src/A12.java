import java.util.Scanner;

public class A12 {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name");
		String ab=sc.next();
		
		//String ab="He@llo#";
		//char ch[]={'H', 'e', '@', 'l', 'l', 'o', '#'};
		char ch []=ab.toCharArray();
		int c=ch.length;
		for(int i=0;i<c;i++) {
			if(ch[i]>= 'a' &&  ch[i]<='z' || ch[i]>= 'A' && ch[i]<='Z'   ) {
				
				
			}else {
				for(int j=i;j<c-1;j++) {
					ch[j]=ch[j+1];
				}
				c--;
				i--;
			}
		}
		for(int j = 0;j<c;j++) {
			
			System.out.print(ch[j]);
		}
	}
}
