
public class A13 {

	public static void main(String[] args) {
		
		int a [] ={10, 4, 63, 1, 67, 8};
//		int el1=0,el2=0,sum=a[0]+a[1];
//		  for(int i=0;i<a.length;i++) {
//			  for(int j=i+1;j<a.length;j++) {
//				  if(a[i]+a[j]<sum) {
//					  
//					  if(sum<0)
//					  el1=a[i];
//					  el2=a[j];
//				  }
//			  }
//		  }System.out.println(el1 +" "+ el2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		int ps=a[0],nl=a[0];   
	
		for(int i=0;i<a.length;i++) {
			if(ps<0) {
				if(a[i]>0) {
					ps=a[i];
				}
			}
			if(ps>a[i] && a[i]>0) {
				ps=a[i];
			}
			
			if(nl>0) {
				if(a[i]<0) {
					nl=a[i];
				}
			}
			if(a[i]<0 && a[i]>nl  ) {
				nl=a[i];
			}	
		}System.out.println(ps+" "+nl);
	}
}
