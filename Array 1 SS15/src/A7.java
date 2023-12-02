
public class A7 {

	public static void main(String[] args) {
		int []a= {4,8,15,21,25};
		
		int x=8,y=25,pos1=0,pos2=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				pos1=i;
			}
			else if(a[i]==y) {
				pos2=i;
			}
		}
		int result=pos2-pos1;
		System.out.println("minimum distance between 8 and 25 is = "+result);
	}
}
