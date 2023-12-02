
public class A32 {


	public static void main(String[] args) {
		int a[]={3, 7, 2, 9, 1, 4, 6},k=2 , sm=a[0],l=a[0],sl=a[0],scm=a[0];
		for(int i=0;i<a.length;i++) {
			
			if(sm==scm) {
				scm=a[i+1];
			}
			if(l<a[i]) {
				sl=l;
				l=a[i];	
		    }else if(sl<a[i]) {
		    	sl=a[i];
		    }
			
			if(sm>a[i]) {
				scm=sm;
				sm=a[i];	
			}
			else if(scm>a[i]) {
				scm=a[i];
			}
		}
		System.out.println("large is= " +l);
		System.out.println("second large = "+sl);
		System.out.println("small = "+sm);
		System.out.println("second small = "+scm);
	}

}
